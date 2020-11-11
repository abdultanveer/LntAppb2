package com.example.lntappb2;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.ProgressBar;

//input type, progress type,result type
public class DownloadTask extends AsyncTask<String,Integer,Void> {
    ProgressBar mProgressBar;
    private static final String TAG = DownloadTask.class.getSimpleName() ;

    public DownloadTask(ProgressBar progressBar) {
        mProgressBar = progressBar;
    }

    /**
     * this method will run on a seperate thread
     * @param strings
     * @return
     */
    @Override
    protected Void doInBackground(String... strings) {
        Log.i(TAG,"doInBackground"+strings[0]);

            try {
                for (int i=1; i<21; i++) {
                    publishProgress(i * 5);
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        mProgressBar.setProgress(values[0]);
    }
}
