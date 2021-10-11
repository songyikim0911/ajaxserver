package org.zerock.ajaxserver;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TimeServlet", value = "/time")
public class TimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //{"time":"2021-08-26"}
        response.setContentType("application/json; charset=UTF-8");//지금부터 서버에서 보내는데이터는 json이라고말해주는것.

        String str="{\"time\":\"2021-08-26\"}";

        response.getWriter().write(str);

    }

}
