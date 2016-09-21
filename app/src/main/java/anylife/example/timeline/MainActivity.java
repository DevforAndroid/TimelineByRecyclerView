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

        models.add(new TimeLineModel("你提交了订单，请等待系统确认", "2016-08-09"));
        models.add(new TimeLineModel("你的订单从德国发货，预计8-22能送达", "2016-08-09"));
        models.add(new TimeLineModel("打包成功", "2016-08-10"));
        models.add(new TimeLineModel("扫描员已经扫描完成", "2016-08-10"));
        models.add(new TimeLineModel("正在运送中 ... ", "2016-08-12"));
        models.add(new TimeLineModel("到达HK海关 ... ", "2016-08-15"));
        models.add(new TimeLineModel("海关 清关中... ", "2016-08-19"));
        models.add(new TimeLineModel("正在送往深圳中康站... ", "2016-08-20"));
        models.add(new TimeLineModel("正在配送中，请保持手机通畅", "2016-08-21"));

        return models;
    }


}
