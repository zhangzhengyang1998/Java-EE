package hbasetest;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class AdminTest {

	public static void main(String[] args) {
		try {
			Configuration conf=HBaseConfiguration.create();
			HBaseAdmin admin=new HBaseAdmin(conf);
//			TableName []tn=admin.listTableNames();
//			for(int i=0;i<tn.length;i++){
//				System.out.println(tn[i].getNameAsString());
//			}
			HTableDescriptor [] htd=admin.listTables();
			for(int i=0;i<htd.length;i++){
				System.out.println(htd[i].getNameAsString());
			}
//			boolean isExist=admin.tableExists("t1".getBytes());
//			System.out.println("t1 is exist");
////			admin.disableTable("t1");
//			admin.deleteTable("t1");
			admin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
