package designFileSystem;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/contest/biweekly-contest-7/problems/design-file-system/
class FileSystem {
    Map<String, Integer> mPath;
    public FileSystem() {
        this.mPath = new HashMap<>();
    }
    public boolean create(String path, int value) {
        if (mPath.containsKey(path)) return false;

        int lastIdx = path.lastIndexOf("/");
        String pathRoot = path.substring(0, lastIdx);
        if (lastIdx != 0 && !mPath.containsKey(pathRoot)) return false;
        mPath.put(path, value);
        return true;
    }
    public int get(String path) {
        return mPath.getOrDefault(path, -1);

    }
}
