package security.demo.controller;

import security.demo.util.ResultUtil;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 姚琛
 * @description
 * @date 2019/5/16
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private ConcurrentHashMap<String, DeferredResult<Object>> map = new ConcurrentHashMap<>();

    @GetMapping("/get")
    public Object getDeferredResult(@ApiParam(value = "键值key") String key) {
        DeferredResult<Object> deferredResult = new DeferredResult<Object>();
        map.put(key, deferredResult);
        return deferredResult;
    }

    @GetMapping("/set")
    public Object setDeferredResult(@RequestParam String key, @RequestParam String str) {
        DeferredResult<Object> deferredResult = map.get(key);
        deferredResult.setResult(ResultUtil.success(str));
        return "success";
    }

}
