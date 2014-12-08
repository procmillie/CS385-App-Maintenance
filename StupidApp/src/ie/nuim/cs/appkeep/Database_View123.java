package ie.nuim.cs.appkeep;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class Database_View123 extends ActionBarActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.database_view123);
		
		//getting the data from the database, we connect this text view with the one in the database_view activity
		TextView tv = (TextView) findViewById(R.id.tv_full_database_view);
		//set up an instance of the Equipment123 class, passing the context of this class to the constructor
		Equipment123 eq = new Equipment123(Database_View123.this);
		//get data from the database, we open the database, which sets up an instance of the database Helper (dbHelper) 
		eq.open();
		//we will return data from our database in the form of a String
		String data = eq.getData();
		//close database
		eq.close();
		//we will use this to display the database information (passed in in the form of a String)
		tv.setText(data);
		
	}

}
