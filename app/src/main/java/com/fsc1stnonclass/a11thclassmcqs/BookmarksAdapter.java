package com.fsc1stnonclass.a11thclassmcqs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookmarksAdapter extends RecyclerView.Adapter<com.fsc1stnonclass.a11thclassmcqs.BookmarksAdapter.Viewholder> {

    private List<QuestionModel> list;
    public BookmarksAdapter(List<QuestionModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bookmark_item,parent,false);

        return new Viewholder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.setData(list.get(position).getQuestion(),list.get(position).getCorrectANS(),position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{

        private ImageButton deletebtan;
        private TextView questions, answers;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            questions = itemView.findViewById(R.id.question);
            answers = itemView.findViewById(R.id.answer);
            deletebtan = itemView.findViewById(R.id.delete_btn);
        }

        private void  setData(String question, String answer, final int position){
            this.questions.setText(question);
            this.answers.setText(answer);

            deletebtan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    list.remove(position);
                    notifyItemRemoved(position);
                }
            });
        }

    }
}
