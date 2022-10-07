/*
 * package dao;
 * 
 * import connectors.MySQLConnector;
 * import mappers.BucketMapper;
 * import models.Bucket;
 * 
 * import java.sql.*;
 * import java.util.List;
 * import java.util.Optional;
 * 
 * public class BucketDAO implements DAO<Bucket>{
 * private final Connection connection;
 * 
 * public BucketDAO() {
 * this.connection = new MySQLConnector().getConnection();
 * }
 * 
 * @Override
 * public Optional<Bucket> getById(int id) throws SQLException {
 * PreparedStatement statement =
 * connection.prepareStatement("Select * from bucket where bucket_id = ?");
 * statement.setInt(1,id);
 * ResultSet resultSet = statement.executeQuery();
 * List<Bucket> buckets = BucketMapper.mapBucketFromResulSet(resultSet);
 * Bucket bucket = null;
 * if (buckets.size()!=0){
 * bucket = buckets.get(0);
 * }
 * statement.close();
 * return Optional.ofNullable(bucket);
 * }
 * 
 * @Override
 * public List<Bucket> getAll() throws SQLException {
 * Statement statement = connection.createStatement();
 * ResultSet resultSet = statement.executeQuery("Select * from bucket");
 * return BucketMapper.mapBucketFromResulSet(resultSet);
 * }
 * 
 * @Override
 * public void save(Bucket bucket) throws SQLException {
 * PreparedStatement statement =
 * connection.prepareStatement("Insert into bucket() value (?,?,?,?)");
 * statement.setInt(1,bucket.getBucket_id());
 * statement.setTimestamp(2, bucket.getPurchese_date());
 * }
 * 
 * @Override
 * public void remove(int id) throws SQLException {
 * PreparedStatement statement =
 * connection.prepareStatement("delete from bucket where bucket_id = ?");
 * statement.setInt(1,id);
 * statement.execute();
 * statement.close();
 * }
 * }
 */
