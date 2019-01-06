package antanina.app.cookaa.adapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;
import antanina.app.cookaa.R;
import antanina.app.cookaa.model.modelJfy;


/**
 * Created by annisatahira on 06/01/19.
 */

public class JfyAdapter extends RecyclerView.Adapter<JfyHolder> {

    Context context;
    private List<modelJfy> jfys;

    public JfyAdapter(Context context, List<modelJfy> jfys) {
        this.context = context;
        this.jfys=jfys;
    }

    @NonNull
    @Override
    public JfyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new JfyHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_jfy_item,null));
    }

    @Override
    public void onBindViewHolder(@NonNull JfyHolder holder, final int position) {
        Glide.with(context).load(jfys.get(position).getImage()).into(holder.imgJfy);

        holder.txtJfy.setText(jfys.get(position).getJudul());
    }

    @Override
    public int getItemCount() {
        return jfys.size();
    }
}

class JfyHolder extends RecyclerView.ViewHolder {

    ImageView imgJfy;
    TextView txtJfy;

    public JfyHolder(View itemView) {
        super(itemView);
        imgJfy = itemView.findViewById(R.id.img_jfy);
        txtJfy = itemView.findViewById(R.id.txt_jfy);
    }
}
