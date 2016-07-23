package generalassembly.yuliyakaleda.startercode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView text_wish;
    private EditText edit_wish;
    private Button button_wish;
    private ListView list_wish;
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: set up all the view and event listeners.
        text_wish = (TextView) findViewById(R.id.textView_wish);
        edit_wish = (EditText) findViewById(R.id.editText_wish);
        button_wish = (Button) findViewById(R.id.button_wish);
        list_wish = (ListView) findViewById(R.id.list_wish);

        //set an adapter
        list_wish.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList));
        button_wish.setOnClickListener(this);

        edit_wish.setOnClickListener(MainActivity.this);
        button_wish.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        // TODO: 1. get the text from the input field
        //       2. animate it in the center of the screen
        //       3. add it to the list wish
        //       4. clear the input field

        String input = edit_wish.getText().toString();
        Animation animation = null;
        animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation);
        text_wish.setText(input);
        text_wish.startAnimation(animation);
        arrayList.add(0, input);
        edit_wish.setText("");
    }
}

