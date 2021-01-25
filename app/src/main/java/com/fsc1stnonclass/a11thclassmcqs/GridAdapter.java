package com.fsc1stnonclass.a11thclassmcqs;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    private int chapters = 0;
    private String subject;

    public GridAdapter(int chapters, String subject) {

        this.chapters = chapters;
        this.subject = subject;
    }

    @Override
    public int getCount() {
        return chapters;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chapter_item,parent,false);
        } else {
            view = convertView;
        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent questionintent = new Intent(parent.getContext(),QuestionActivity.class);
                questionintent.putExtra("subject", subject);
                questionintent.putExtra("chapterNo", position+1);
                parent.getContext().startActivity(questionintent);
            }
        });

        ((TextView)view.findViewById(R.id.textview)).setText(String.valueOf(position+1));
        return view;
    }
}
