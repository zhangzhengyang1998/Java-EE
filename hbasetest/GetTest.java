package hbasetest;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

public class GetTest {

	public static void main(String[] args) {
		try{
			Configuration conf=HBaseConfiguration.create();
			HTable table=new HTable(conf, "t1");
			Get get=new Get(Bytes.toBytes("rowkey002"));
			get.setMaxVersions();
			Result r=table.get(get);
			for(Cell cell:r.rawCells()){
				System.out.print("rowkey:");
				System.out.print(Bytes.toString(r.getRow())+";");
				System.out.print("Familiy:Quilifier:"
				+Bytes.toString(CellUtil.cloneFamily(cell))+","
						+Bytes.toString(CellUtil.cloneQualifier(cell))+","
						+Bytes.toString(CellUtil.cloneRow(cell))+";");
				System.out.print(Bytes.toString(CellUtil.cloneValue(cell)));
			}
			table.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
