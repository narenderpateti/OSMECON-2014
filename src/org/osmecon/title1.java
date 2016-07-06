package org.osmecon;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class title1 extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.title1);

		final Button b = (Button) findViewById(R.id.a1);
		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Animation anim = AnimationUtils.loadAnimation(title1.this,
						R.anim.animate);
				b.startAnimation(anim);
			}
		});

	}
}