package hbasetest;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Durability;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

public class PutTest {

	public static void main(String[] args) {
		try{
			Configuration conf=HBaseConfiguration.create();
			HTable table = new HTable(conf, "t1");
			Put put=new Put(Bytes.toBytes("rowkey002"));
			put.add(Bytes.toBytes("tnew"), Bytes.toBytes("col1"), Bytes.toBytes("val3"));
			put.setDurability(Durability.ASYNC_WAL);
			table.put(put);
			table.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
