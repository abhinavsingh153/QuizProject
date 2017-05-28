package com.django1.yogesh.quizzz;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase sql;
    RadioGroup radioGroup;
    int i,Q=0;
    int result=0;
    Cursor c;//Cursor is used for fetching the database
    String answer="";//
    TextView textView;
    RadioButton radioButton,radioButton2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);//
        radioButton=(RadioButton)findViewById(R.id.radioButton);
        radioButton2=(RadioButton)findViewById(R.id.radioButton2);
        textView=(TextView)findViewById(R.id.textView);

         ArrayList <String> q=new ArrayList<String>();
        ArrayList <String> opta=new ArrayList<String>();
        ArrayList <String> optb=new ArrayList<String>();
        ArrayList <String> ans=new ArrayList <String>();
        sql=openOrCreateDatabase("myz",MODE_PRIVATE,null);

        q.add("Capital of india?");
        q.add("What does SQL stand for?");
        q.add("what is the full form of CSS");
        q.add("HTML stands for?");
        q.add("what does ASP stand for?");
        q.add("PHP Stands for?");
        q.add("XML stand for?");
        q.add("DMRC stand for?");
        q.add("HP stand for?");

        opta.add("Delhi");       optb.add("Mumbai");          ans.add("Delhi");
        opta.add("Simple Query Language");   optb.add("Structured Query Language");      ans.add("Structured Query Language");
        opta.add("Cascading Style Sheets");       optb.add("Colorful Style Sheets");          ans.add("Cascading Style Sheets");
        opta.add("HyperText Markup Language");       optb.add("Hamaar Tumhaar Markup Language ");          ans.add("HyperText Markup Language");
        opta.add("Active Server Pages");       optb.add("A Server page");          ans.add("Active Server Pages");
        opta.add("Pagal He Pagal");       optb.add("PHP: Hypertext Preprocessor");          ans.add("PHP: Hypertext Preprocessor");
        opta.add("X-Markup Language");       optb.add("eXtensible Markup Language");          ans.add("eXtensible Markup Language");
        opta.add("Delhi Metro Rail Corporation");       optb.add("Delhi Main Railways Corps");          ans.add("Delhi Metro Rail Corporation");
        opta.add("Hewlett Packard");       optb.add("Hera Pheri");          ans.add("Hewlett Packard");

        sql.execSQL("create table if not exists quiz(serial varchar,quest varchar,op1 varchar,op2 varchar,ans varchar)");//
//        Iterator itr=q.iterator();
//        Iterator itr2=opta.iterator();
//        Iterator itr3=optb.iterator();
//        Iterator itr4=ans.iterator();
//        while(itr.hasNext()){
//            Object element=itr.next();
//            sql.execSQL("insert into test (quest) values('"+element+"')");
//        }
//        while(itr2.hasNext()){
//            Object element2=itr2.next();
//            sql.execSQL("insert into test (op1) values('"+element2+"')");
//        }
//        while(itr3.hasNext()){
//            Object element3=itr3.next();
//            sql.execSQL("insert into test (op2) values('"+element3+"')");
//        }
//        while(itr4.hasNext()){
//            Object element4=itr4.next();
//            sql.execSQL("insert into test (ans) values('"+element4+"')");
//        }
//        for(int i=1;i<=9;i++){
//            sql.execSQL("insert into test (serial) values('"+i+"')");
//        }
       for(i=0;i<=8;i++) {
            sql.execSQL("insert into quiz values ('" + i + "','" + q.get(i) + "','" + opta.get(i) + "'," +
                    "'" + optb.get(i) + "','" + ans.get(i) + "')");// insert is a command and quiz is the table name...


        }


//        Object qq[]=q.toArray();
//        Object optaa[]=opta.toArray();
//        Object optbb[]=optb.toArray();
//        Object anss[]=ans.toArray();
//        for(int i=0;i<9;i++){
//            sql.execSQL("insert into test values ('" + i + "','" + qq[i] + "','" + optaa[i]+ "'," +
//                  "'" + optbb[i]+ "','" +anss[i]+ "')");
//        }

      //  sql.execSQL("insert into test values ('" + 1 + "','" + q.get(1) + "','" + opta.get(1) + "'," +
               // "'" + optb.get(1) + "','" + ans.get(1) + "')");
//        sql.execSQL("insert into quiz" +
//                " values ('" + 2 + "','" + q.get(2) + "','" + opta.get(2) + "'," +
//                "'" + optb.get(2) + "','" + ans.get(2) + "')");
//        sql.execSQL("insert into quiz values ('" + 3 + "','" + q.get(3) + "','" + opta.get(3) + "'," +
//                "'" + optb.get(3) + "','" + ans.get(3) + "')");
//        sql.execSQL("insert into quiz values ('" + 4 + "','" + q.get(4) + "','" + opta.get(4) + "'," +
//                "'" + optb.get(4) + "','" + ans.get(4) + "')");
//        sql.execSQL("insert into quiz values ('" + 5 + "','" + q.get(5) + "','" + opta.get(5) + "'," +
//                "'" + optb.get(5) + "','" + ans.get(5) + "')");
//        sql.execSQL("insert into quiz values ('" + 6 + "','" + q.get(6) + "','" + opta.get(6) + "'," +
//                "'" + optb.get(6) + "','" + ans.get(6) + "')");
//        sql.execSQL("insert into quiz values ('" + 7 + "','" + q.get(7) + "','" + opta.get(7) + "'," +
//                "'" + optb.get(7) + "','" + ans.get(7) + "')");
//        sql.execSQL("insert into quiz values ('" + 8 + "','" + q.get(8) + "','" + opta.get(8) + "'," +
//                "'" + optb.get(8) + "','" + ans.get(8) + "')");
        c=sql.rawQuery("select * from quiz",null);//rawquery is used to put the data in the table on the screen
         c.moveToFirst();//places the cursor on location 1
        setquestion();//





        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Rules for Quiz Play", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent intent=new Intent(MainActivity.this,Rules.class);
                startActivity(intent);
            }
        });
    }
public void nextquestion(View view){
    radioGroup=(RadioGroup)findViewById(R.id.radiogroup);
    RadioButton a=(RadioButton)findViewById(radioGroup.getCheckedRadioButtonId());//
    radioButton.setChecked(false);//it will check the r
    radioButton2.setChecked(false);

    if(a.getText().equals(answer)){
        Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
        result++;
        Log.d("message","45");//
    }



        if(Q==8){

        Intent intent=new Intent(this,Result.class);


            intent.putExtra("Score",result);
            startActivity(intent);
        }
        else{c.moveToNext();
            setquestion();
           Q++;
        }

}


      public void setquestion(){
                 radioButton.setText(c.getString(c.getColumnIndex("op1")));
          radioButton2.setText(c.getString(c.getColumnIndex("op2")));
          answer=c.getString(c.getColumnIndex("ans"));

      }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
