package fr.diabhelp.messenger.MailBox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import fr.diabhelp.messenger.ChatActivity;
import fr.diabhelp.messenger.R;

/**
 * Created by vigour_a on 18/03/2016.
 */
public class MailBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_box);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Mail Box");
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Carnetintent = new Intent(MailBoxActivity.this, ChatActivity.class);
                startActivity(Carnetintent);
            }
        });

    }
}