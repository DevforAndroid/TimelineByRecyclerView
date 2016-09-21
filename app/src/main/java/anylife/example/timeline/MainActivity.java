package anylife.example.timeline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import anylife.example.timeline.adapter.TimeLineAdapter;
import anylife.example.timeline.model.TimeLineModel;

/**
 * 放
 *
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecycler = (RecyclerView) findViewById(R.id.time_line_recycler);
        initRecycler();
    }

    private void initRecycler() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        TimeLineAdapter adapter = new TimeLineAdapter(getData());

        mRecycler.setLayoutManager(layoutManager);
        mRecycler.setAdapter(adapter);
    }

    private List<TimeLineModel> getData() {
        List<TimeLineModel> models = new ArrayList<TimeLineModel>();

        models.add(new TimeLineModel("XiaoMing", 21));
        models.add(new TimeLineModel("XiaoFang", 20));
        models.add(new TimeLineModel("XiaoHua", 25));
        models.add(new TimeLineModel("XiaoA", 22));
        models.add(new TimeLineModel("XiaoNiu", 23));

        return models;
    }


}
