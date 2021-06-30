package com.swufe.javaee.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/hobbyFind")
public class HobbyServlet extends HttpServlet {
    private Map<String, ArrayList<String>> userHobby;

    public List getList(String a){
        List<String> list = new ArrayList<>();
        list.add(a);
        return list;
    }
    public void init() {
        userHobby = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("skiing");
        list1.add("scuba");
        userHobby.put("Bob",list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("skiing");
        list2.add("scuba");
        userHobby.put("Jim",list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("knitting");
        list3.add("scuba");
        userHobby.put("James",list3);

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("dating");
        list4.add("scuba");
        userHobby.put("Tom",list4);

        ArrayList<String> list5 = new ArrayList<>();
        list5.add("dating");
        list5.add("scuba");
        userHobby.put("Tom",list5);

        ArrayList<String> list6 = new ArrayList<>();
        list6.add("dating");
        list6.add("knitting");
        userHobby.put("Fei",list6);

        ArrayList<String> list7 = new ArrayList<>();
        list7.add("dating");
        list7.add("scuba");
        list7.add("skiing");
        userHobby.put("Pradeep",list7);

        ArrayList<String> list8 = new ArrayList<>();
        list8.add("skiing");
        list8.add("knitting");
        userHobby.put("Philippe",list8);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String hobby = request.getParameter("hobby");
        List<String> names = new ArrayList<>();
        userHobby.forEach((k, v) -> {
            if (v.contains(hobby)) {
                names.add(k);
            }
        });
        request.setAttribute("names", names);
        request.setAttribute("hobby", hobby);
        // Two JSPs have different UI styles.
        //  request.getRequestDispatcher("hobbyResult.jsp").forward(request, response);
        request.getRequestDispatcher("hobbyResult2.jsp").forward(request, response);
    }

}