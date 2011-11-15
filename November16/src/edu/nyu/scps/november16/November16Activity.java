//homework 4, draw graphics

package edu.nyu.scps.november16;

import android.app.Activity;
import android.os.Bundle;

public class November16Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        November16 november16 = new November16(this);
        setContentView(november16);
    }
}