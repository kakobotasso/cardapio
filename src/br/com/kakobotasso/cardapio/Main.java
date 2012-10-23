package br.com.kakobotasso.cardapio;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;

public class Main extends Activity {
	private Button btEntrarHome;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void associarElementos(){
    	this.btEntrarHome = (Button) findViewById(R.id.btEntrarHome);
    }

}
