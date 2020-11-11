package com.example.lntappb2;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.ProgressBar;

//input type, progress type,result type
public class DownloadTask extends AsyncTask<String,Integer,Void> {

    private static final String TAG = DownloadTask.class.getSimpleName() ;

    public DownloadTask(ProgressBar progressBar) {
    }

    /**
     * this method will run on a seperate thread
     * @param strings
     * @return
     */
    @Override
    protected Void doInBackground(String... strings) {
        Log.i(TAG,strings[0]);
        return null;
    }
}
