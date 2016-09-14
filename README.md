# List of Java Nio FileSystems

A list of Java nio Filesystems, some descriptions and tests.

[JSR-203]() is a specification for filesystems. It is a large standard with a buildin implementations for all default 
FileSystems: unix, windows. Other than the original system around the File class this spec allows further implementations.
Below is a list of such filesystems.

## Legend
  
* filesystem
  [level of JSR-203 implementation] [version on maven central] [tested] [report]   
  

## FileSystems 
### In Memory Filesystems

* [google/JimFS](https://github.com/google/jimfs)
  [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.google.jimfs/jimfs/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.google.jimfs/jimfs)  
* [marschall/memoryfilesystem](https://github.com/marschall/memoryfilesystem)
* [openCage/memoryfs](https://github.com/openCage/memoryfs) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.pfabulist.lindwurm/memoryfs/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.pfabulist.lindwurm/memoryfs)
* [openCage/memoryntfs](https://github.com/openCage/memoryntfs)
* [sbridges/ephemeralfs](https://github.com/sbridges/ephemeralfs)
* [jboss/shrinkwrap](https://github.com/shrinkwrap)

* [pbzdyl/memoryfs](https://github.com/pbzdyl/memoryfs)
* [weltraumschaf/jvs](https://github.com/weltraumschaf/jvs)
* [sylvainjuge/memoryfs](https://github.com/sylvainjuge/memoryfs)  
* [twh270/jmemfs](https://github.com/twh270/jmemfs)
* [nidi3/j7sf](https://github.com/nidi3/j7sf)

### archive

* [mkr/archivefs](https://github.com/mkr/archivefs)
* [marschall/zipfilesystem-standalone](https://github.com/marschall/zipfilesystem-standalone)
* [truevfs](https://truevfs.java.net/)

### box

* [fge/java7-fs-box](https://github.com/fge/java7-fs-box)

### dropbox

* [fge/java7-fs-dropbox](https://github.com/fge/java7-fs-dropbox)

### encrypting

* [usrflo/encfs4j](https://github.com/usrflo/encfs4j) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.agitos/encfs4j/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.agitos/encfs4j)
* [openCage/stellvertreter](https://github.com/openCage/stellvertreter) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.pfabulist.lindwurm/stellvertreter/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.pfabulist.lindwurm/stellvertreter)

### ftp

* [uis-it/nio-fs-provider/tree/master/sftp](https://github.com/uis-it/nio-fs-provider/tree/master/sftp)

### git

* [beijunyi/ParallelGit](https://github.com/beijunyi/ParallelGit)
 
#### github

* [gnodet/githubfs](https://github.com/gnodet/githubfs)

### gluster

* [semiosis/glusterfs-java-filesystem](https://github.com/semiosis/glusterfs-java-filesystem)

### google drive

* [JacobRusso/gdocs](https://github.com/JacobRusso/jrtestapp02/tree/master/gdocs)

### google app engine

* [gaevfs](https://code.google.com/p/gaevfs/)

### hash

* [samv/HashFS](https://github.com/samvv/HashFS)

### hadoop

* [damiencarol/jsr203-hadoop](https://github.com/damiencarol/jsr203-hadoop)
* [TIQSolutions/HDFSProvider](https://github.com/TIQSolutions/HDFSProvider)

### openstack swift

* [platformlayer/openstack-fileprovider](https://github.com/platformlayer/openstack-fileprovider)
* [philborlin/swift-filesystem](https://github.com/philborlin/swift-filesystem)

### manta

* [dekobon/manta-nio2-driver](https://github.com/dekobon/manta-nio2-driver)

### resources in classloader

* [JakeWharton/resourcefs](https://github.com/JakeWharton/resourcefs)

### s3

* [w7tek/s3-filesystem](https://github.com/w7tek/s3-filesystem)
* [Upplication/Amazon-S3-FileSystem-NIO2](https://github.com/Upplication/Amazon-S3-FileSystem-NIO2)

### smb

* [uis-it/nio-fs-provider/tree/master/smb](https://github.com/uis-it/nio-fs-provider/tree/master/smb)
* [chalha/de.tttproject.jcifs](https://github.com/chalha/de.tttproject.jcifs)

### ssh

* [lucastheisen/jsch-nio](https://github.com/lucastheisen/jsch-nio)


### webdav

* [uis-it/nio-fs-provider/tree/master/webdav](https://github.com/uis-it/nio-fs-provider/tree/master/webdav)


### wrapping

* [myGrid/fswrap](https://github.com/myGrid/fswrap)

### other

* [arikkfir/mosaic](https://github.com/arikkfir/mosaic/tree/de9bd294c0c93bf21e7af38fc6c4672c04e51a12/org.mosaic.launcher/src/main/java/org/mosaic/launcher)
* [blovemaple/java-baidupcs](https://github.com/blovemaple/java-baidupcs)


## Helper

### Frameworks

* [openCage/eightyfs](https://github.com/openCage/eightfs) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.pfabulist.lindwurm/eightyfs/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.pfabulist.lindwurm/eightyfs)
* [fge/java7-fs-base](https://github.com/fge/java7-fs-base) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.fge/java7-fs-base/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.fge/java7-fs-base)

### Other

* [openCage/niodav](https://github.com/openCage/niodav)

## Tests

* [openCage/niotest](https://github.com/openCage/niotest)

### Memory FileSystems

Unsurprisingly memory FileSystems are them most common form. They are an ideal tool for testing and other purposes. 
But surprisingly they appeared quite late after Java 7 
introduced the possibility. There is no build in memory filesystem. But now there is a good selection.
But because JSR-203 is quite large none implements it completely or bug free.

MemoryFilesystems are often configurable. The different configuration might have quite different features.


| filesystem / feature           | active |  CRUD | Hard Links | Soft Links | Attributes | FileLock | FileChannel | PathMatcher | WatchService | unix | windows | mac |  
|:-------------------------------|:------:|:-----:| :---------:|:----------:|:----------:|:--------:|:-----------:|:-----------:|:------------:|:----:|:-------:|:---:| 
|**google/JimFS**                | yes    | yes   | yes        | yes        | yes        | yes      | yes         | yes         | yes          | yes  | yes     | ? |                                                
|**openCage/memoryfs**           | yes    | yes   | yes        | yes        | yes        | no       | no          | yes         | yes          | yes  | yes     | ? |
|**marschall/memoryfilesystem**  | yes    | yes   | no         | yes        | yes        | yes      | ues         | yes         | no           | yes  | yes     | ? |



