package edu.hzuapps.androidlabs2018.soft1606070302104;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Soft1606070302104Activity extends AppCompatActivity {
    private Button btn;
    private Button btn0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soft1606070302104);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new MyButtonListener() );
        btn0 = (Button) findViewById(R.id.button0);
        btn0.setOnClickListener(new MyButtonListener0() );
    }
    //这个属于一个内部类
    class MyButtonListener implements OnClickListener {
        //
        public void onClick(View v) {
            // TODO Auto-generated method stub
            //创建一个Intent的实例
            Intent intent = new Intent();
            //设置从哪个activity启动哪个activity
            intent.setClass(Soft1606070302104Activity.this, second2Activity.class);
            //启动另一个activity
            Soft1606070302104Activity.this.startActivity(intent);
        }
    }

    class MyButtonListener0 implements OnClickListener {
        //
        public void onClick(View v) {
            // TODO Auto-generated method stub
            //创建一个Intent的实例
            Intent intent0 = new Intent();
            //设置从哪个activity启动哪个activity
            intent0.setClass(Soft1606070302104Activity.this, third3Activity.class);
            //启动另一个activity
            Soft1606070302104Activity.this.startActivity(intent0);
        }
    }
}
