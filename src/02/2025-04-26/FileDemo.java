import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {

    private static  int javaCount = 0;
    private static  int readmeCount = 0;
    public static void main(String[] args) throws IOException {

        // 当创建File对象的时候，并不去计算机中检查文件是否存在
        // 只是将路径字符串标记为一个file对象
        // 要求文件存放的路径必须存在
        File file = new File("./src/02/2025-04-27/readme.md");
//        File dir = new File("./src/02/2025-04-28");

        // 创建文件,不能创建目录
//        boolean b = file.createNewFile();

        // 创建目录
        // 只能穿件目录不能创建文件
//        boolean bm = dir.mkdir();

        // 可以创建多层目录
//        boolean bm2 = dir.mkdirs();

        // 删除文件
        // 把这个文件从计算机中彻底删除，此操作不可逆
        // 既可以删除文件又可以删除目录
//        boolean bd = file.delete();

        // 在子目录存在的话，不能删除
//        boolean bd2 = file.delete();

//        System.out.println(bd);

//        getAllDirAndFile("./src/02/2025-04-26");
//        System.out.println("readmecount：" + readmeCount);
//        System.out.println("javacount：" + javaCount);

//        System.out.println(file.isAbsolute());;
//        System.out.println(file.exists());
//        file.setExecutable(false);// 让文件是否可执行
//        file.setReadable(true);
//        file.setWritable(true);

        // 表示给当前用户设置可写权限
//        boolean b = file.setWritable(true, true);

        // file.setLastModified(12133112);// 设置修改时间

//        System.out.println(file.lastModified());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getParent());
//        System.out.println(file.getName());

//        System.out.println(File.separatorChar);
//        System.out.println(File.separator);
//        System.out.println(File.pathSeparator);
        File[] fs = file.listFiles(new FileFilter() {
            // 参数表示当前目录下的子目录和子文件
            @Override
            public boolean accept(File pathname) {
//                return pathname.isDirectory();
                return pathname.isFile();
            }
        });
        File[] fs2 = file.listFiles(pathname -> pathname.isFile());
        File[] fs3 = file.listFiles(pathname -> pathname.isDirectory());

        File[] fs4 = file.listFiles(new FilenameFilter() {
            // dir表示文件所在的父目录
            // name表示文件或者目录的名字
            @Override
            public boolean accept(File dir, String name) {
                return name.matches(".*\\d.*");
            }
        });


        // 路径不改变而文件名改变的情况下；做的是重命名
        // 文件名改变而路径改变，做的是剪切
        // 要求存放的路径中没有同名文件
        boolean bfile = file.renameTo(new File("./src/02/2025-04-27/readme.md"));




    }

    public static void getAllDirAndFile(String path) {
        File file = new File(path);
        // 获取所有的子目录和文件
        File[] fs = file.listFiles();

        for(File f : fs) {
            // System.out.println(f);
            if (f.isDirectory()) {
                getAllDirAndFile(f.getPath());
            } else {
                String name = f.getName();
                if (name.endsWith("readme.md")) {
                    readmeCount++;
                } else if (name.endsWith(".java")) {
                    javaCount++;
                }
            }
        }

        String name = file.getName();
        if (name.endsWith("readme.md")) {
            readmeCount++;
        } else if (name.endsWith(".java")) {
            javaCount++;
        }
    }

    public static void del(File file) {
        // 判断是否为空
        if (file == null) {
            throw new NullPointerException("文件不存在");
        }

        if (file.isDirectory()) {
            File[] fs = file.listFiles();


            if (fs.length > 0) {
                for(File f : fs) {
                    if (f.isDirectory()) {
                        del(f);
                    } else {
                        String filename = f.getName();
                        boolean bjava = filename.endsWith(".java");
                    }
                }
            }
        }

        // 无论是文件还是目录都需要删除
        file.delete();
    }
}