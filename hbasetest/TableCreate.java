package hbasetest;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class TableCreate {

	public static void main(String[] args) {
		try {
			Configuration conf=HBaseConfiguration.create();
			HBaseAdmin admin=new HBaseAdmin(conf);
			HTableDescriptor table=new HTableDescriptor(TableName.valueOf("t1"));
			HColumnDescriptor col=new HColumnDescriptor("tnew");
			table.addFamily(col);
			admin.createTable(table);
			admin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
