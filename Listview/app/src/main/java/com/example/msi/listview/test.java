public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> nameArr = new ArrayList<>();

        nameArr.add("a");
        nameArr.add("b");
        nameArr.add("c");
        nameArr.add("d");
        nameArr.add("e");
        nameArr.add("f");
        nameArr.add("g");
        nameArr.add("h");
        nameArr.add("i");

        ListView lv = (ListView) findViewById(R.id.main_ListView);
        MyAdapter ma = new MyAdapter(this, nameArr);
        lv.setAdapter(ma);
    }

    public class MyAdapter extends BaseAdapter {
        Context mContext;
        ArrayList<String> nameArr;

        public MyAdapter(Context context, ArrayList<String> nameArr) {
            this.mContext = context;
            this.nameArr = nameArr;

        }

        @Override
        public int getCount() {
            return nameArr.size();
        }

        @Override
        public Object getItem(int position) {
            return nameArr.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                LayoutInflater li = LayoutInflater.from(mContext);
                convertView = li.inflate(R.layout.activity_item, null);
            }

            EditText name = (EditText) convertView.findViewById(R.id.view_name);
            Button btn = (Button) convertView.findViewById(R.id.view_Button);

            name.setText(nameArr.get(position));
            System.out.println("" + convertView);
            return convertView;
        }
    }
}
