package com.fsc1stnonclass.a11thclassmcqs;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.viewholder> {

    private List<subjectModel> subjectModelsList;

    public SubjectAdapter(List<subjectModel> subjectModelsList) {
        this.subjectModelsList = subjectModelsList;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.subject_item,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        holder.setData(subjectModelsList.get(position).getUrl(),subjectModelsList.get(position).getName(),subjectModelsList.get(position).getChapters());
    }

    @Override
    public int getItemCount() {
        return subjectModelsList.size();
    }

    class viewholder extends RecyclerView.ViewHolder{

        private CircleImageView imageView;
        private TextView title;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            title = itemView.findViewById(R.id.title);
        }

        private void setData (String url, String title,int chapters){
            Glide.with(itemView.getContext()).load(url).into(imageView);
            this.title.setText(title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent setintent = new Intent(itemView.getContext(),ChapterActivity.class);
                    setintent.putExtra("title",title);
                    setintent.putExtra("chapters",chapters);
                    itemView.getContext().startActivity(setintent);
                }
            });
        }
    }
}
