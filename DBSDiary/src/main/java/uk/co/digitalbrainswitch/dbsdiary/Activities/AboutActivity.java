package uk.co.digitalbrainswitch.dbsdiary.Activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import uk.co.digitalbrainswitch.dbsdiary.MyApplication;
import uk.co.digitalbrainswitch.dbsdiary.R;

public class AboutActivity extends Activity {

    Typeface font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        font = ((MyApplication) getApplication()).getCustomTypeface();
        this.initialise();

        findViewById(R.id.ivAboutDBSLogo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.dbs_url))));
            }
        });
    }

    private void initialise() {
        TextView txt = (TextView) findViewById(R.id.tvAboutText);
        txt.setTypeface(font);
        txt = (TextView) findViewById(R.id.tvAboutVersion);
        txt.setTypeface(font);
        txt.setText("Version: " + getString(R.string.text_version));

        TextView titleBar = (TextView) getWindow().findViewById(android.R.id.title);
        titleBar.setTypeface(font);
    }
}
