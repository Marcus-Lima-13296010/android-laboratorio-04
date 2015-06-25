package com.example.laboratorio04;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AcessoActivity extends Activity {

	private Button botaoOk; //cria instancia do botão que fará acesso
	private Button botaoLimpar; //para criar uma instancia do botão que irá limpar os dados
	private EditText acessoEditText; //para poder me referenciar ao texto
	private EditText senhaEditText; // para poder me referenciar a senha
	private TextView resultadoAcessoTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_acesso);
		
		acessoEditText = (EditText) findViewById(R.id.acessoEditText);
		senhaEditText = (EditText) findViewById(R.id.senhaEditText);
		resultadoAcessoTextView = (EditText) findViewById(R.id.resultadoTextView);
	
		botaoOk = (Button)findViewById(R.id.acessoButton);
		botaoOk.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
			
				okButtonAction();
		}

			private void okButtonAction() {
				String acessoInserido = acessoEditText.getText().toString();
				String senhaInserida = senhaEditText.getText().toString();
				
				if(acessoInserido.equals("Marcus")&& senhaInserida.equals("2345")){
					resultadoAcessoTextView.setText("Acesso Ok!");
				} else {
					resultadoAcessoTextView.setText("Acesso Negado!");	
				}

				
			}
		});	
	botaoLimpar = (Button) findViewById(R.id.limparButton);		
	botaoLimpar.setOnClickListener(new OnClickListener(){
		public void onClick(View v){
		
			limparButtonAction();
	}

		private void limparButtonAction() {
		acessoEditText.setText(null);
		senhaEditText.setText(null);	
		resultadoAcessoTextView.setText(null);
		}
					
		
	});	
}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.acesso, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
