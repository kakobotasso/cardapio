package br.com.kakobotasso.cardapio;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	private Button btEntrarHome;
	private Intent it;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        associarElementos();
        mudarTela();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void associarElementos(){
    	this.btEntrarHome = (Button) findViewById(R.id.btEntrarHome);
    	this.it = new Intent(this, Mesas.class);
    }
    
    public void mudarTela(){
    	this.btEntrarHome.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(it);
			}
		});
    }

}
