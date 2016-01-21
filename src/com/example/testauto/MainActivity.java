package com.example.testauto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	AutoCompleteTextView autotext;
	ArrayAdapter arrayAdapter;
	public SearchAdapter adapter = null;//
	// ��Ҫ��ȡ
	public String[] hanzi = new String[] { "����֤ȯ100002", "����֤ȯ100001",
			"ũҵ����200001", "��������300001", "��������100001", "��������100001",
			"�й�����100002", "��������500002", "�Ϻ�����100010", "�ַ�����200009" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		autotext = (AutoCompleteTextView) findViewById(R.id.autotext);
		// String[] arr = { "Ҧ1", "Ҧw", "Ҧ3" };
		// arrayAdapter = new ArrayAdapter<String>(this,
		// android.R.layout.simple_list_item_1, arr);
		// autotext.setAdapter(arrayAdapter);
		adapter = new SearchAdapter<String>(this,
				android.R.layout.simple_dropdown_item_1line, hanzi,
				SearchAdapter.ALL);// �ٶ�����
		autotext.setAdapter(adapter);
		autotext.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
Toast.makeText(MainActivity.this, "�����"+arg2+"��", Toast.LENGTH_LONG).show();			
			}
		});
	}
}
