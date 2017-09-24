package com.example.flow;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 自定义ViewGroup
 * 1、onMeasure：测量子View的宽和高，设置自己的宽和高
 * 2、onLayout：设置子View的位置
 *
 * onMeasure：根据子Viwe的布局文件，为子View设置测量模式和测量值
 *
 * 测量=测量模式+测量值；
 *
 * 测量模式：3种
 * 1、EXACTLY
 * 2、AT_MOST
 * 3、UNSPECIFIED
 *
 * LayoutParams的类型由它的父控件决定。父控件是xxx类型返回的就是xxx.LayoutParams
 */
public class MainActivity extends ActionBarActivity {

	private String[] mVals = new String[] {
			"苹果手机", "笔记本电脑", "电饭煲 ", "腊肉",
			"welcome","android","TextView",
			"jordan","layout","viewgroup",
			"特产", "剃须刀", "宝宝", "康佳",
			"name","type","search","logcat"
	};

	private LayoutInflater mInflater;
	private FlowLayout mFlowLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mInflater = LayoutInflater.from(this);
		mFlowLayout = (FlowLayout) findViewById(R.id.id_flowlayout);

		initData();
	}

	public void initData() {
		//找到搜索标签的控件
		for (int i = 0; i < mVals.length; i++) {
			TextView tv = (TextView) mInflater.inflate(R.layout.search_label_tv, mFlowLayout, false);
			tv.setText(mVals[i]);

			final String str = tv.getText().toString();

			//点击事件
			tv.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
                                    Toast.makeText(MainActivity.this,"您点击了："+str, Toast.LENGTH_SHORT).show();
				}
			});

			mFlowLayout.addView(tv);
		}

	}

}
