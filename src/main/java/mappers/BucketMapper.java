package mappers;

import entity.Bucket;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BucketMapper {
    public static List<Bucket> mapBucketFromResulSet(ResultSet resultSet)throws SQLException {
        List<Bucket> buckets = new ArrayList<>();
        while (resultSet.next()){
            Bucket bucket = new Bucket(
                    resultSet.getInt(1),
                    resultSet.getTimestamp(2));
            buckets.add(bucket);
        }
        return buckets;
    }
}
