package com.wl.ghojcodesandbox;


import com.wl.ghojcodesandbox.model.ExecuteCodeRequest;
import com.wl.ghojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
