package sg.edu.np.mad.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Button mButtonFollow;
    private Boolean follow_state = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonFollow =findViewById(R.id.btn_follow);

        mButtonFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (follow_state) {
                    mButtonFollow.setText("Unfollow");
                    follow_state = false;
                } else{
                    mButtonFollow.setText("Follow");
                    follow_state = true;
                }
            }
        });
    }


}
