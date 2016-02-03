package cn.com.domain;

import lombok.Data;
import org.mongodb.morphia.annotations.Entity;

import java.util.Date;

/**
 * Created by Administrator on 2016/2/3.
 * 文档数据源
 */
@Data
@Entity(value = "FileMetaData")
public class FileMetaData {

    /**
     * 文件名字
     */
    private String name;

    /**
     * 文件类型
     */
    private String type;

    /**
     * 文件长度
     */
    private long length;

    /**
     * 文件描述信息
     */
    private String description;

    /**
     * 文件创建时间
     */
    private Date createdAt;

    /**
     * gridfs上的文件id
     */
    private String gridsfs;

    /**
     * 文件内容
     */
    //@FormParam("image")
    private String data;

    /**
     * 文件url
     */
    private String url;

    public FileMetaData copy() {
        FileMetaData metaData = new FileMetaData();
        metaData.setName(getName());
        metaData.setType(getType());
        metaData.setLength(getLength());
        metaData.setDescription(getDescription());
        metaData.setCreatedAt(new Date());
        metaData.setGridsfs(getGridsfs());
        return metaData;
    }

}
