package com.example.taruc.lap2explicit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void visitTARUC(View v)
    {
        String url="http://www.tarc.edu.my";
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        if(intent.resolveActivity(getPackageManager())!=null)
        startActivity(intent);
        else
            Log.d("ImplicitIntents","Can't handle the intent");

    }

    public void showMain(View v)
    {
        Intent intent=new Intent(Intent.ACTION_MAIN);
        startActivity(intent);
    }

    public void showDial(View v)
    {
        Intent intent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+"0123456789"));
        startActivity(intent);
    }

    public void showSentTo(View v)
    {
        Intent intent=new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"+"limtj-pa16@student.tarc.edu.my"));
        if(intent.resolveActivity(getPackageManager())!=null)
            startActivity(intent);
        else
            Log.d("ImplicitIntents","Can't handle the intent");


    }

    protected void onPause()
    {
        super.onPause();;
        Log.d("Main","onPause");
    }

    protected void onResume()
    {
        super.onResume();
        Log.d("Main","onResumen");
    }
}
