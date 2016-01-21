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
	// 需要读取
	public String[] hanzi = new String[] { "长江证券100002", "长江证券100001",
			"农业银行200001", "工商银行300001", "招商银行100001", "建设银行100001",
			"中国银行100002", "华夏银行500002", "上海银行100010", "浦发银行200009" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		autotext = (AutoCompleteTextView) findViewById(R.id.autotext);
		// String[] arr = { "姚1", "姚w", "姚3" };
		// arrayAdapter = new ArrayAdapter<String>(this,
		// android.R.layout.simple_list_item_1, arr);
		// autotext.setAdapter(arrayAdapter);
		adapter = new SearchAdapter<String>(this,
				android.R.layout.simple_dropdown_item_1line, hanzi,
				SearchAdapter.ALL);// 速度优先
		autotext.setAdapter(adapter);
		autotext.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
Toast.makeText(MainActivity.this, "点击第"+arg2+"个", Toast.LENGTH_LONG).show();			
			}
		});
	}
}
