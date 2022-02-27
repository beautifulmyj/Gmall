import com.alibaba.fastjson.JSONObject;
import com.alibaba.ververica.cdc.debezium.DebeziumDeserializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.util.Collector;
import org.apache.kafka.connect.source.SourceRecord;

public class MyDeserialization implements DebeziumDeserializationSchema<String> {
    @Override
    public void deserialize(SourceRecord sourceRecord, Collector<String> collector) throws Exception {
        String topic = sourceRecord.topic();
        JSONObject resultJSON = new JSONObject();

        collector.collect(resultJSON.toJSONString());
    }

    @Override
    public TypeInformation<String> getProducedType() {
        return null;
    }
}
