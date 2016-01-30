<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/1/30
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

  <title>Empire - XHTML Template</title>
  <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
  <meta name="description" content="Empire - XHTML Template" />

  <!-- CSS -->
  <link href="<c:url value='/resources/fonts/sansation.css'/>" rel="stylesheet" type="text/css" />	<!-- Get any font from here easily: http://www.google.com/webfonts -->
  <link href="<c:url value='/resources/css/style.css'/>"  rel="stylesheet" type="text/css" />
  <link href="<c:url value='/resources/fancybox/jquery.fancybox-1.3.4.css'/>" rel="stylesheet" type="text/css" />
  <link href="<c:url value='/resources/css/nivo-slider.css'/>"  rel="stylesheet" type="text/css" />
  <link href="<c:url value='/resources/css/styler-farbtastic.css'/>" rel="stylesheet" type="text/css" />

  <!-- UPDATE BROWSER WARNING IF IE 7 OR LOWER -->
  <!--[if lt IE 8]>
  <link href="<c:url value='/resources/css/stop_ie.css'/>" rel="stylesheet" type="text/css" />
  <![endif]-->


  <!-- JAVASCRIPTS -->
  <script type="text/javascript" src="js/jquery.min.js"></script>
  <script type="text/javascript" src="js/jquery-ui-1.8.17.custom.min.js"></script>
  <script type="text/javascript" src="fancybox/jquery.fancybox-1.3.4.pack.js"></script>
  <script type="text/javascript" src="js/jquery.nivo.slider.js"></script>
  <script type="text/javascript" src="js/jquery.bgslider.js"></script>
  <script type="text/javascript" src="js/preloader.js"></script>
  <script type="text/javascript" src="js/farbtastic.js"></script>
  <script type="text/javascript" src="js/basic.js"></script>
  <script type="text/javascript" src="js/styler.js"></script>
  <script type="text/javascript" src="js/contact_form.js"></script>


</head>
<body>

<!-- DISPLAY MESSAGE IF JAVA IS TURNED OFF -->
<noscript>
  <div id="notification">Please turn on javascript in your browser for the maximum experience!</div>
</noscript>

<!-- DISPLAY THIS MESSAGE IF USER'S BROWSER IS IE7 OR LOWER -->
<div id="ie_warning"><img src="images/warning.png" alt="" /><br /><strong>Your browser is out of date!</strong><br /><br />This website uses the latest web technologies so it requires an up-to-date, fast browser!<br />Try <a href="<c:url value='/resources/http://www.mozilla.org/en-US/firefox/new/?from=getfirefox">Firefox</a> or <a href="<c:url value='/resources/https://www.google.com/chrome">Chrome</a>!</div>


<!-- STYLER FOR DEMO -->
<div id="styler">
  <div id="styler-button"><a href="<c:url value='/resources/#"><img src="images/styler-button.png" alt="" /></a></div>

  <div class="styler-title"><img src="images/styler-t1.png" alt="" /></div>

  <ul id="texture">
    <li><a href="<c:url value='/resources/#" id="styler-texture-1">None</a></li>
    <li id="selected"><a href="<c:url value='/resources/#" id="styler-texture-2">Leather</a></li>
    <li><a href="<c:url value='/resources/#" id="styler-texture-3">Carbon</a></li>
  </ul>

  <div class="styler-title"><img src="images/styler-t2.png" alt="" /></div>

  <div id="styler-colorpicker" class="colorpicker"></div>
</div>


<!-- SITE WRAPPER -->
<div id="wrapper">

  <!-- PAGE WITH CONTENTS -->
  <div id="page">
    <div id="content">


      <h1>Posts from the blog</h1>

      <div class="hr"></div>

      <!-- BLOG POSTS WITH SMALL THUMBS -->
      <ul id="blog-small">
        <li>
          <div class="blog-small-image">
            <a href="<c:url value='/resources/post.html"><span class="imghover_small_blog"></span><img src="images/post1.jpg" alt="" /></a>
          </div>
          <div class="blog-small-text">
            <h1><a href="<c:url value='/resources/post.html">Mauris nec velit tortor, quis euismod</a></h1>

            <p class="blog-info">&nbsp;<img src="images/icon-time.png" alt="" />&nbsp;March 14, 2012&nbsp;
              <img src="images/sep.gif" alt="" />&nbsp;&nbsp;<img src="images/icon-category.png" alt="" /><a href="<c:url value='/resources/#">News</a>, <a href="<c:url value='/resources/#">Travel</a>&nbsp;&nbsp;<img src="images/sep.gif" alt="" />&nbsp;&nbsp;
              <img src="images/icon-comment.png" alt="" />&nbsp;0 Comment(s)
            </p>

            <p class="blog-small-excerpt">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras vel enim sem, in vulputate augue. Praesent vitae velit convallis sapien varius accumsan sit amet eu lacus.  <br /><a href="<c:url value='/resources/post.html" class="read_more">Continue reading &rarr;</a></p>
          </div>
        </li>
        <!-- POST SEPARATOR -->
        <li class="blog-small-sep"></li>


        <li>
          <div class="blog-small-image">
            <a href="<c:url value='/resources/post.html"><span class="imghover_small_blog"></span><img src="images/post1.jpg" alt="" /></a>
          </div>
          <div class="blog-small-text">
            <h1><a href="<c:url value='/resources/post.html">Praesent vitae velit convallis sapien</a></h1>

            <p class="blog-info">&nbsp;<img src="images/icon-time.png" alt="" />&nbsp;March 14, 2012&nbsp;
              <img src="images/sep.gif" alt="" />&nbsp;&nbsp;<img src="images/icon-category.png" alt="" /><a href="<c:url value='/resources/#">News</a>, <a href="<c:url value='/resources/#">Travel</a>&nbsp;&nbsp;<img src="images/sep.gif" alt="" />&nbsp;&nbsp;
              <img src="images/icon-comment.png" alt="" />&nbsp;0 Comment(s)
            </p>

            <p class="blog-small-excerpt">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras vel enim sem, in vulputate augue. Praesent vitae velit convallis sapien varius accumsan sit amet eu lacus. <br /><a href="<c:url value='/resources/post.html" class="read_more">Continue reading &rarr;</a></p>
          </div>
        </li>
        <!-- POST SEPARATOR -->
        <li class="blog-small-sep"></li>


        <li>
          <div class="blog-small-image">
            <a href="<c:url value='/resources/post.html"><span class="imghover_small_blog"></span><img src="images/post1.jpg" alt="" /></a>
          </div>
          <div class="blog-small-text">
            <h1><a href="<c:url value='/resources/post.html">Lorem ipsum dolor sit amet</a></h1>

            <p class="blog-info">&nbsp;<img src="images/icon-time.png" alt="" />&nbsp;March 14, 2012&nbsp;
              <img src="images/sep.gif" alt="" />&nbsp;&nbsp;<img src="images/icon-category.png" alt="" /><a href="<c:url value='/resources/#">News</a>, <a href="<c:url value='/resources/#">Travel</a>&nbsp;&nbsp;<img src="images/sep.gif" alt="" />&nbsp;&nbsp;
              <img src="images/icon-comment.png" alt="" />&nbsp;0 Comment(s)
            </p>

            <p class="blog-small-excerpt">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras vel enim sem, in vulputate augue. Praesent vitae velit convallis sapien varius accumsan sit amet eu lacus.  <br /><a href="<c:url value='/resources/post.html" class="read_more">Continue reading &rarr;</a></p>
          </div>
        </li>
        <!-- POST SEPARATOR -->
        <li class="blog-small-sep"></li>


        <li>
          <div class="blog-small-image">
            <a href="<c:url value='/resources/post.html"><span class="imghover_small_blog"></span><img src="images/post1.jpg" alt="" /></a>
          </div>
          <div class="blog-small-text">
            <h1><a href="<c:url value='/resources/post.html">Vestibulum ante ipsum primis</a></h1>

            <p class="blog-info">&nbsp;<img src="images/icon-time.png" alt="" />&nbsp;March 14, 2012&nbsp;
              <img src="images/sep.gif" alt="" />&nbsp;&nbsp;<img src="images/icon-category.png" alt="" /><a href="<c:url value='/resources/#">News</a>, <a href="<c:url value='/resources/#">Travel</a>&nbsp;&nbsp;<img src="images/sep.gif" alt="" />&nbsp;&nbsp;
              <img src="images/icon-comment.png" alt="" />&nbsp;0 Comment(s)
            </p>

            <p class="blog-small-excerpt">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras vel enim sem, in vulputate augue. Praesent vitae velit convallis sapien varius accumsan sit amet eu lacus.  <br /><a href="<c:url value='/resources/post.html" class="read_more">Continue reading &rarr;</a></p>
          </div>
        </li>
      </ul><!-- #blog-small ends -->

      <div class="hr"></div>


      <!-- FOOTER -->
      <div id="footer_widget_area">
        <!-- FIRST FOOTER AREA / POPULAR POSTS -->
        <div id="first">
          <h3>Popular Posts</h3>

          <ul class="posts_list">
            <li>
              <p class="posts_list_pic">
                <a href="<c:url value='/resources/post.html"><img src="images/post-tn1.jpg" alt="" /></a>
              </p>

              <p class="posts_list_excerpt">
                <a href="<c:url value='/resources/post.html"><strong>Praesent vitae velit convallis</strong></a>
                <br />February 22, 2012
              </p>
            </li>

            <li>
              <p class="posts_list_pic">
                <a href="<c:url value='/resources/post.html"><img src="images/post-tn1.jpg" alt="" /></a>
              </p>

              <p class="posts_list_excerpt">
                <a href="<c:url value='/resources/post.html"><strong>Lorem ipsum dolor sit amet</strong></a>
                <br />January 28, 2012
              </p>
            </li>

            <li>
              <p class="posts_list_pic">
                <a href="<c:url value='/resources/post.html"><img src="images/post-tn1.jpg" alt="" /></a>
              </p>

              <p class="posts_list_excerpt">
                <a href="<c:url value='/resources/post.html"><strong>Mauris nec velit tortor quis </strong></a>
                <br />March 14, 2012
              </p>
            </li>
          </ul>
        </div>

        <!-- SECOND FOOTER AREA / ARCHIVES -->
        <div id="second">
          <h3>Archives</h3>

          <ul class="archives">
            <li><a href="<c:url value='/resources/#" title="March 2012">March 2012</a></li>
            <li><a href="<c:url value='/resources/#" title="February 2012">February 2012</a></li>
            <li><a href="<c:url value='/resources/#" title="January 2012">January 2012</a></li>
            <li><a href="<c:url value='/resources/#" title="December 2011">December 2011</a></li>
          </ul>
        </div>

        <!-- THIRD FOOTER AREA / CONTACT FORM -->
        <div id="third">
          <h3>Contact Form</h3>

          <form action="" id="contact_form" method="post">
            <ul class="contact_form">
              <li><input type="text" id="ub_w_cf1" name="ub_w_cf_name" /><label>Name</label></li>
              <li><input type="text" id="ub_w_cf2" name="ub_w_cf_email" /><label>Email</label></li>
              <li><textarea id="ub_w_cf3" rows="" cols="" name="ub_w_cf_msg" class="required"></textarea></li>
              <li><input type="text" id="ub_w_cf4" name="ub_w_cf_captcha" class="required" maxlength="4" /><img src="captcha.php" id="captcha" alt="" /><label>Captcha</label></li>
              <li id="ub_w_cf_sbtn"><input class="send_button" type="submit" value="OK" /></li>
            </ul>
          </form>
        </div>
      </div>


    </div><!-- #content ends -->
  </div><!-- #page ends -->


  <!-- SIDEBAR -->
  <div id="sidebar">
    <div id="sidebar-color"></div>		<!-- SIDEBAR COLOR LAYER -->
    <div id="sidebar-border"></div>		<!-- SIDEBAR BORDER LAYER -->
    <div id="sidebar-light"></div>		<!-- SIDEBAR RADIAL GRADIENT LIGHT LAYER -->
    <div id="sidebar-texture"></div>	<!-- SIDEBAR TEXTURE LAYER -->

    <!-- SIDEBAR CONTENT LAYER -->
    <div id="sidebar-content">

      <!-- LOGO -->
      <div id="logo">
        <a href="<c:url value='/resources/index.html"><img src="images/logo.png" alt="" /></a>
      </div>

      <!-- MENU -->
      <ul id="menu">
        <li><a href="<c:url value='/resources/index.html">HOME</a></li>
        <li class="current"><a href="<c:url value='/resources/blog-1.html">BLOG</a>
          <ul>
            <li><a href="<c:url value='/resources/blog-1.html">BLOG STYLE #1</a></li>
            <li><a href="<c:url value='/resources/blog-2.html">BLOG STYLE #2</a></li>
          </ul>
        </li>
        <li><a href="<c:url value='/resources/portfolio-3c.html">PORTFOLIO</a>
          <ul>
            <li><a href="<c:url value='/resources/portfolio-3c.html">PORTFOLIO &#8211; 3 COLUMNS</a></li>
            <li><a href="<c:url value='/resources/portfolio-2c.html">PORTFOLIO &#8211; 2 COLUMNS</a></li>
          </ul>
        </li>
        <li><a href="<c:url value='/resources/gallery.html">GALLERY</a></li>
        <li><a href="<c:url value='/resources/#">STYLINGS</a>
          <ul>
            <li><a href="<c:url value='/resources/stylings-texts.html">TEXTS</a></li>
            <li><a href="<c:url value='/resources/stylings-table_columns.html">TABLE &#038; COLUMNS</a></li>
            <li><a href="<c:url value='/resources/stylings-tabs_toggles.html">TABS, TOGGLES &#038; CAROUSEL</a></li>
            <li><a href="<c:url value='/resources/stylings-images_videos.html">IMAGES &#038; VIDEOS</a></li>
            <li><a href="<c:url value='/resources/stylings-contact_buttons.html">CONTACT FORM &#038; BUTTONS</a></li>
          </ul>
        </li>
      </ul>

    </div><!-- #sidebar-content ends -->

    <!-- SOCIAL ICONS ON SIDEBAR'S BOTTOM PART -->
    <ul id="sidebar-bottom">
      <li><a href="<c:url value='/resources/#"><img src="images/sidebar_icons/facebook.png" alt="" /></a></li>
      <li><a href="<c:url value='/resources/#"><img src="images/sidebar_icons/twitter.png" alt="" /></a></li>
      <li><a href="<c:url value='/resources/#"><img src="images/sidebar_icons/rss.png" alt="" /></a></li>
    </ul>

    <!-- COPYRIGHT TEXT -->
    <p id="copyright">EMPIRE XHTMLMore Templates <a href="<c:url value='/resources/http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="<c:url value='/resources/http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>

  </div><!-- #sidebar ends -->

</div><!-- #wrapper ends -->


<!-- BACKGROUND SLIDER -->
<div id="bg_slider">
  <img src="images/bgslider-1.jpg" alt="" />
  <img src="images/bgslider-2.jpg" alt="" />
  <img src="images/bgslider-3.jpg" alt="" />
</div>


</body>
</html>
