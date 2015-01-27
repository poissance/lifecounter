package edu.washington.hudson.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;


public class LifeCounterMain extends ActionBarActivity {

    private List<Integer> numTimes;
    private int player1Score;
    private int player2Score;
    private int player3Score;
    private int player4Score;
    private String loserMessage;
    private TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            player1Score = savedInstanceState.getInt("PLAYER1_SCORE");
            player2Score = savedInstanceState.getInt("PLAYER2_SCORE");
            player3Score = savedInstanceState.getInt("PLAYER3_SCORE");
            player4Score = savedInstanceState.getInt("PLAYER4_SCORE");
            loserMessage = savedInstanceState.getString("LOSER_MESSAGE");
        } else {
            setContentView(R.layout.activity_life_counter_main);
            t = (TextView)findViewById(R.id.textView5);
            player1Score = Integer.parseInt(t.getText().toString());
            t = (TextView)findViewById(R.id.textView6);
            player2Score = Integer.parseInt(t.getText().toString());
            t = (TextView)findViewById(R.id.textView7);
            player3Score = Integer.parseInt(t.getText().toString());
            t = (TextView)findViewById(R.id.textView8);
            player4Score = Integer.parseInt(t.getText().toString());
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_life_counter_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        // Store UI state to the savedInstanceState.
        // This bundle will be passed to onCreate on next call.  EditText txtName = (EditText)findViewById(R.id.txtName);
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("PLAYER1_SCORE",player1Score);
        savedInstanceState.putInt("PLAYER2_SCORE",player2Score);
        savedInstanceState.putInt("PLAYER3_SCORE",player3Score);
        savedInstanceState.putInt("PLAYER4_SCORE",player4Score);
        savedInstanceState.putString("LOSER_MESSAGE",loserMessage);
    }

    public void onClick(View V) {
        switch(V.getId()) {
            case R.id.button: //minus 1
                Log.i("LifeCounter Derp", "Player 1 button 1 clicked");
                player1Score--;
                t = (TextView)findViewById(R.id.textView5);
                t.setText("" + player1Score);
                break;
            case R.id.button2:
                Log.i("LifeCounter Derp", "Player 1 button 2 clicked");
                player1Score++;
                t = (TextView)findViewById(R.id.textView5);
                t.setText("" + player1Score);
                break;
            case R.id.button3:
                Log.i("LifeCounter Derp", "Player 1 button 3 clicked");
                player1Score-=5;
                t = (TextView)findViewById(R.id.textView5);
                t.setText("" + player1Score);
                break;
            case R.id.button4:
                Log.i("LifeCounter Derp", "Player 1 button 4 clicked");
                player1Score+=5;
                t = (TextView)findViewById(R.id.textView5);
                t.setText("" + player1Score);
                break;
            case R.id.button5:
                player2Score--;
                t = (TextView)findViewById(R.id.textView6);
                t.setText("" + player2Score);
                break;
            case R.id.button6:
                player2Score++;
                t = (TextView)findViewById(R.id.textView6);
                t.setText("" + player2Score);
                break;
            case R.id.button7:
                player2Score-=5;
                t = (TextView)findViewById(R.id.textView6);
                t.setText("" + player2Score);
                break;
            case R.id.button8:
                player2Score+=5;
                t = (TextView)findViewById(R.id.textView6);
                t.setText("" + player2Score);
                break;
            case R.id.button9:
                player3Score--;
                t = (TextView)findViewById(R.id.textView7);
                t.setText("" + player3Score);
                break;
            case R.id.button10:
                player3Score++;
                t = (TextView)findViewById(R.id.textView7);
                t.setText("" + player3Score);
                break;
            case R.id.button11:
                player3Score-=5;
                t = (TextView)findViewById(R.id.textView7);
                t.setText("" + player3Score);
                break;
            case R.id.button12:
                player3Score+=5;
                t = (TextView)findViewById(R.id.textView7);
                t.setText("" + player3Score);
                break;
            case R.id.button13:
                player4Score--;
                t = (TextView)findViewById(R.id.textView8);
                t.setText("" + player4Score);
                break;
            case R.id.button14:
                player4Score++;
                t = (TextView)findViewById(R.id.textView8);
                t.setText("" + player4Score);
                break;
            case R.id.button15:
                player4Score-=5;
                t = (TextView)findViewById(R.id.textView8);
                t.setText("" + player4Score);
                break;
            case R.id.button16:
                player4Score+=5;
                t = (TextView)findViewById(R.id.textView8);
                t.setText("" + player4Score);
                break;
        }
        t = (TextView)findViewById(R.id.textView9);
        if (player1Score <= 0) {
            t.setText("Player 1 LOSES!");
        }
        if (player2Score <= 0) {
            t.setText("Player 2 LOSES!");
        }
        if (player3Score <= 0) {
            t.setText("Player 3 LOSES!");
        }
        if (player4Score <= 0) {
            t.setText("Player 4 LOSES!");
        }
    }
}
