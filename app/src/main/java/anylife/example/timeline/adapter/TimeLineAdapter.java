package anylife.example.timeline.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import anylife.example.timeline.R;
import anylife.example.timeline.model.TimeLineModel;
import anylife.example.timeline.widget.TimeLineMarker;

public class TimeLineAdapter extends RecyclerView.Adapter<TimeLineAdapter.TimeLineViewHolder> {
	private List<TimeLineModel> mDataSet;

	public TimeLineAdapter(List<TimeLineModel> models) {
		mDataSet = models;
	}

	@Override
	public int getItemViewType(int position) {
		final int size = mDataSet.size() - 1;
		if (size == 0)
			return ItemType.ATOM;
		else if (position == 0)
			return ItemType.START;
		else if (position == size)
			return ItemType.END;
		else return ItemType.NORMAL;
	}

	@Override
	public TimeLineViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
		return new TimeLineViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_time_line, viewGroup, false), viewType);
	}

	@Override
	public void onBindViewHolder(TimeLineViewHolder timeLineViewHolder, int i) {

		timeLineViewHolder.mName.setText(mDataSet.get(i).getEvent());
		timeLineViewHolder.mAge.setText(mDataSet.get(i).getTime());

	}

	@Override
	public int getItemCount() {
		return mDataSet.size();
	}


	public class TimeLineViewHolder extends RecyclerView.ViewHolder {
		private TextView mName;
		private TextView mAge;

		public TimeLineViewHolder(View itemView, int type) {
			super(itemView);

			mName = (TextView) itemView.findViewById(R.id.item_time_line_txt);
			mAge = (TextView) itemView.findViewById(R.id.item_time_line_txt2);

			TimeLineMarker mMarker = (TimeLineMarker) itemView.findViewById(R.id.item_time_line_mark);
			if (type == ItemType.ATOM) {
				mMarker.setBeginLine(null);
				mMarker.setEndLine(null);
			} else if (type == ItemType.START) {
				mMarker.setBeginLine(null);
			} else if (type == ItemType.END) {
				mMarker.setEndLine(null);
			}

		}


	}

}
