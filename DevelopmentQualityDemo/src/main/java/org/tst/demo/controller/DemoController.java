package org.tst.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/d")
@Api(value = "test", tags = "UserController")
public class DemoController {

    @ApiOperation(value = "demo", notes = "demo")
    @ApiResponses({//方法返回值的swagger注释
            @ApiResponse(code = 200,message = "s",response = String.class),
            @ApiResponse(code = 400,message = "444",response = String.class),
            @ApiResponse(code = 500,message = "500",response = String.class)
    })
    @GetMapping(path="/demo/{msg}", produces = "application/json")
    @ResponseBody
    public String demo(@PathVariable("msg") String msg) {
        return "demo : " + msg;
    }
}
