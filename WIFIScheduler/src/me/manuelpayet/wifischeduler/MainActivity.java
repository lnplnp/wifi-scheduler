package me.manuelpayet.wifischeduler;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final Button buttonSayHello = (Button) findViewById(R.id.buttonSayHello);
    buttonSayHello.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        final TextView textViewHelloWorld = (TextView) findViewById(R.id.textViewHelloWorld);
        int visibility = (textViewHelloWorld.getVisibility() == View.VISIBLE) ? View.INVISIBLE
            : View.VISIBLE;
        textViewHelloWorld.setVisibility(visibility);
      }
    });
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.activity_main, menu);
    return true;
  }

}
