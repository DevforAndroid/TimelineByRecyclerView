package anylife.example.timeline.adapter;

/**
 * 定义时间轴 的位置信息，一般的只要start,end,ATOM 3 中状态就行了，
 *
 */
public class ItemType {
    public final static int NORMAL = 0;

    public final static int HEADER = 1;
    public final static int FOOTER = 2;

    public final static int START = 4;
    public final static int END = 8;
    public final static int ATOM = 16;
}
