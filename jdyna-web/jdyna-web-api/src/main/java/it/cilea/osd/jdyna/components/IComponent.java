package it.cilea.osd.jdyna.components;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IComponent
{
    void evalute(HttpServletRequest request, HttpServletResponse response) throws Exception;

    List<String[]> sublinks(HttpServletRequest request,
            HttpServletResponse response) throws Exception;
}