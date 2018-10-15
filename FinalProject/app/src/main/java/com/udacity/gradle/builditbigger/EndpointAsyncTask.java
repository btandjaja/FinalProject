package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;
import android.util.Log;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import java.io.IOException;

public class EndpointAsyncTask extends AsyncTask<Void, Void, String>{
    private MyApi myApiService = null;
    //TODO remove
    private String TAG = EndpointAsyncTask.class.getSimpleName();
    @Override
    protected String doInBackground(Void... Void) {
        if (myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
//                    .setRootUrl("http://localhost:8080/_ah/api/")
                    .setRootUrl("http://10.0.2.2:8080/_ah/api/")
//                        .setRootUrl("http://10.120.0.87:8080/_ah/api/")
//                        .setRootUrl("http://73.71.105.94:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });
            // end options for devappserver
            myApiService = builder.build();
        }

        try {
//            String joke = myApiService.retrieveJoke().execute().getJoke();
//            return joke;
                return myApiService.retrieveJoke().execute().getJoke();
//            return myApiService.sayHi("John").execute().getData();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
        //TODO remove
        Log.d(TAG, "******"+result);
    }
}
