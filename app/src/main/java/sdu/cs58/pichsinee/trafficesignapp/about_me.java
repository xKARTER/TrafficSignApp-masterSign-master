package sdu.cs58.pichsinee.trafficesignapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class about_me extends AppCompatActivity {

    MediaPlayer mediaPlayer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }

    public void clickBack(View view) {
        finish();

    }

    public void playSound(View view) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }//END IF!!

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cat);
        mediaPlayer.start();

    }

    public void clickFaceBook(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/Karter.kanitin"));
        startActivity(fbIntent);
    }

    public void clickMobile(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel:0970985987"));
        startActivity(mobileIntent);
    }

    public void cilckMap(View view) {
        String lat = "13.777065";
        String lng = "100.510944";
        String label = "มหาวิทยาลัยสวนดุสิต";


        Uri location = Uri.parse("https://maps.google.com/maps?z=10&q=loc:" + lat + "," + lng + "(" + label + ")");
        //Uri location = Uri.parse("https://maps.google.com/maps/maps?z=10&q=loc:" + lat + "," + lng + "("+label+")");

        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        mapIntent.setPackage("com.google.android.apps.maps"); //ถ้าแอพในมือถือต้องการลิงค์กำgooglemap ในการแสดงผล
        startActivity(mapIntent);
        //ถ้าเราะtest ในgenymotion คำสั่งนี้จะไม่มีผล

    }
}
