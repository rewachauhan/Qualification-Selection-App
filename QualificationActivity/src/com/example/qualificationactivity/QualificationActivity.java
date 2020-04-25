package com.example.qualificationactivity;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class QualificationActivity extends Activity {
	CheckBox c1,c2,c3,c4;
	StringBuffer sb;
	Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualification);
        c1=(CheckBox) findViewById(R.id.checkBox1);
        c2=(CheckBox) findViewById(R.id.checkBox2);
        c3=(CheckBox) findViewById(R.id.checkBox3);
        c4=(CheckBox) findViewById(R.id.checkBox4);
        bt=(Button) findViewById(R.id.button1);
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String data="";
				sb=new StringBuffer();
				if(c1.isChecked())
				{
					data=" "+c1.getText().toString()+" ";
					sb.append(data);
				}
				if(c2.isChecked())
				{
					data=" "+c2.getText().toString()+" ";
					sb.append(data);
				}
				if(c3.isChecked())
				{
					data=" "+c3.getText().toString()+" ";
					sb.append(data);
				}
				if(c4.isChecked())
				{
					data=" "+c4.getText().toString()+" ";
					sb.append(data);
				}
				
				Toast.makeText(getApplicationContext(),"you selected"+sb.toString(),Toast.LENGTH_LONG).show();
				
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.qualification, menu);
        return true;
    }
    
}
