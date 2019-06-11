package hbasetest;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.util.Bytes;

public class DeleteTest {

	public static void main(String[] args) {
		try{
			Configuration conf=HBaseConfiguration.create();
			HTable table=new HTable(conf, "t1");
			Delete delete=new Delete(Bytes.toBytes("rowkey001"));
			//删除列到一个版本
			//delete.deleteColumn(Bytes.toBytes("tnew"), Bytes.toBytes("col1"));
			//删除列到所有版本
			delete.deleteColumns(Bytes.toBytes("tnew"), Bytes.toBytes("col1"));
			table.delete(delete);
			table.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
