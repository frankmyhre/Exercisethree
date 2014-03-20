package dk.myhre.exercisethree;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity implements OnClickListener {

	TextView tv;
	EditText et, st, pt;
	Button but1, but2;
	ImageView iv;
	Intent i;
	
	private String url;
	private String TAG;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TAG = "Exercisethree";
		
		iv = (ImageView) findViewById(R.id.antpicture);
		
		tv = (TextView) findViewById(R.id.welcome);
		et = (EditText) findViewById(R.id.textfield);
		but1 = (Button) findViewById(R.id.changebutton);
		
		pt = (EditText) findViewById(R.id.psswrd);
		
		st = (EditText) findViewById(R.id.webfield);
		but2 = (Button) findViewById(R.id.sitebutton);
		
		but1.setOnClickListener(this);
		but2.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		return true;
	}

	@Override
	public void onClick(View v) {
		url = st.getText().toString();
		
		if(v == but1){
			Log.i(TAG,"User pressed the first button");
			tv.setText("Welcome dear user\r\nYou wrote: "+et.getText().toString());
		}else if(v == but2){
			Log.i(TAG,"User entered: "+url+" through the webview");
			i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
			startActivity(i);
		}
		
	}

}
