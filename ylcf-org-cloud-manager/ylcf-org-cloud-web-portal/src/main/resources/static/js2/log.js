/* jdf-1.0.0/ log.js Date:2017-02-09 17:08:53 */
!function(){if(!window.uba_lab_tag){window.uba_lab_tag=!0;var a={"www.jd.com":['/div[id="cate_item1"]','/div[id="cate_item2"]','/div[id="cate_item3"]','/div[id="cate_item4"]','/div[id="cate_item5"]','/div[id="cate_item6"]','/div[id="cate_item7"]','/div[id="cate_item8"]','/div[id="cate_item9"]','/div[id="cate_item10"]','/div[id="cate_item11"]','/div[id="cate_item12"]','/div[id="cate_item13"]','/div[id="cate_item14"]','/div[id="cate_item15"]','/li[id="ttbar-myjd"]/div[1]','/li[id="ttbar-serv"]/div[1]','/li[id="ttbar-navs"]/div[1]','/div[id="settleup-content"]']};var b={universal:['/ul[id="shelper"]','/li[id="nav-licai"]/ul[1]','/li[id="nav-zhongchou"]/ul[1]','/li[id="nav-baoxian"]/ul[1]','/li[id="nav-baitiao"]/ul[2]','/li[id="nav-loan"]/ul[1]','/li[id="nav-caimi"]/ul[1]','/li[id="nav-dongjia"]/ul[1]','/div[id="J_searchRecommend"]','/div[id="J_searchKeyWords"]','/div[id="J_userCenterBoard"]','/div[id="ceilinglamp"]'],urls:{"www.jd.com":['/li[id="ttbar-myjd"]/div[1]','/div[id="ttbar-apps-main"]','/div[id="ttbar-atte-main"]','/li[id="ttbar-serv"]/div[1]','/li[id="ttbar-navs"]/div[1]','/div[id="cate_item','/div[id="lift"]/ul[0]','/div[id="settleup-content"]','/ul[id="mcart-sigle"]','/div[id="settleup-content"]','/div[id="category-item','/div[id="J-global-toolbar'],"shouji.jd.com":['/div[id="phoneCategorys"]/div[0]/div[1]'],"channel.jd.com/fashion.html":['/div[id="p-categroy"]/div[1]'],"jr.jd.com":['/div[id="container"]/div[0]/div[0]/div[0]/div[1]'],"tuan.jd.com/quanguo-index.html":['/div[id="categorys-2015"]/div[1]/div[7]/div[1]','/div[id="categorys-2015"]/div[1]/div[8]/div[1]','/div[id="categorys-2015"]/div[1]/div[9]/div[1]','/div[id="categorys-2015"]/div[1]/div[10]/div[1]','/ul[id="shelperTuan"]'],"chaoshi.jd.com":[],"book.jd.com":['/div[id="p-category"]/div[0]/div[1]'],"diannao.jd.com":['/div[id="oaCategorys"]/div[0]/div[1]'],"channel.jd.com/electronic.html":['/div[id="comCategorys"]/div[1]/div[1]/div[0]/div[1]'],"www.jd.hk":[],"channel.jd.com/sports.html":['/div[id="sortlist"]/div[0]'],"auction.jd.com/home.html":['/div[id="focus"]/div[0]/div[0]'],"channel.jd.com/food.html":['/div[id="p-category"]/div[0]/div[1]'],"e.jd.com/ebook.html":['/div[id="p-category"]/div[0]/div[1]'],"channel.jd.com/beauty.html":['/div[id="beauty"]/div[0]/div[0]/div[0]/div[0]/div[1]'],"channel.jd.com/luxury.html":['/div[id="p-categroy"]/div[1]'],"channel.jd.com/furniture.html":['/div[id="sortlist"]/div[0]'],"shuma.jd.com":['/div[id="oaCategorys"]/div[0]/div[1]'],"baby.jd.com":['/div[id="p-category"]/div[0]/div[1]'],"channel.jd.com/home.html":['/div[id="sortlist"]/div[0]'],"channel.jd.com/health.html":['/div[id="p-category"]/div[0]/div[1]'],"channel.jd.com/1620-1625.html":['/div[id="p-category"]/div[1]'],"channel.jd.com/watch.html":['/div[id="p-category"]/div[0]/div[2]'],"channel.jd.com/luxury.html":['/div[id="p-categroy"]/div[1]'],"channel.jd.com/wine.html":['/div[id="p-category"]/div[0]/div[1]'],"fresh.jd.com":["/html[0]/body[1]/div[5]/div[0]/div[0]/ul[1]"],"china.jd.com":['/div[id="p-category"]/div[0]/div[1]'],"mvd.jd.com":['/div[id="p-category"]/div[0]/div[1]'],"e.jd.com/ebook.html":['/div[id="p-category"]/div[0]/div[1]']}};function c(a,b){var c=!1;for(var d=0,e=a.length;e>d;d++){var f=a[d];f=f.replace(/\[/gm,"\\["),f=f.replace(/\]/gm,"\\]");var g=new RegExp(f);if(g.test(b)){c=a[d];break}}return c}var d={addHandler:function(a,b,c){a.addEventListener?a.addEventListener(b,c,!1):a.attachEvent?a.attachEvent("on"+b,c):a["on"+b]=c},removeHandler:function(a,b,c){a.addEventListener?a.removeEventListener(b,c,!1):a.attachEvent?a.detachEvent("on"+b,c):a["on"+b]=null},getEvent:function(a){return a?a:window.event},getTarget:function(a){return a.target||a.srcElement},preventDefault:function(a){a.preventDefault?a.preventDefault():a.returnValue=!1},stopPropagation:function(a){a.stopPropagaiton?a.stopPropagaiton():a.cancelBubble=!0}};function e(a){var b=0;var c=a.parentNode.firstChild;for(;c;c=c.nextSibling)if(1===c.nodeType){if(c===a)break;b+=1}return b}function f(a){var b=a.substr(1).split("/");var c=b.shift();var d=[];if(c.indexOf("id")>-1){var e=/\".*?\"/gi;c=c.match(e)[0].replace(/\"/gi,function(){return""});for(var f=0;f<b.length;f++){var g=b[f];g=g.match(/\d+/)[0],d.push(parseInt(g))}var h=document.getElementById(c);for(var i=0;i<d.length;i++){var j=d[i];h=h.children[j]}return h}}function g(a){if("html"==a.nodeName.toLowerCase()||"body"==a.nodeName.toLowerCase())return null;var b=function(a){var c=a.parentNode;var d="";if(c)try{var f=c.getAttribute("id");var g=/^ad\d+/gi;f&&!g.test(f)?d+=c.nodeName.toLowerCase()+'[id="'+c.getAttribute("id")+'"]/':(d+=c.nodeName.toLowerCase()+"["+e(c)+"]/",d+=b(c))}catch(h){}return d};var c;return c=a.getAttribute("id")?a.nodeName.toLowerCase()+'[id="'+a.getAttribute("id")+'"]/':a.nodeName.toLowerCase()+"["+e(a)+"]/"+b(a),c.split("/").reverse().join("/")}function h(a){var b=d.getTarget(a);var c=g(b);if(!document.getElementById("tracelessLogDebug")){var e=document.createElement("textarea");var f=900;var h=20;e.id="tracelessLogDebug",e.style.border="1px #C81623 solid",e.style.padding="5px 10px",e.style.width=f+"px",e.style.height=h+"px",e.style.background="#C81623",e.style.color="#fff",e.style.zIndex=100,e.style.opacity=.7,e.style.position="fixed",e.style.left="50%",e.style.top="0px",e.style.marginLeft="-"+f/2+"px",document.getElementsByTagName("body")[0].appendChild(e)}"tracelessLogDebug"!=b.getAttribute("id")&&(document.getElementById("tracelessLogDebug").innerHTML=c),d.preventDefault(a)}var i=function(a,b){var c=function(a){for(var b=0,c=0;c<a.length;c++)b=(b<<5)-b+a.charCodeAt(c),b&=b;return b};return Math.abs(c(a))%b};var j=function(a){var b=a+"=";var c=document.cookie.split(";");for(var d=0;d<c.length;d++){var e=c[d];for(;" "==e.charAt(0);)e=e.substring(1,e.length);if(0==e.indexOf(b))return e.substring(b.length,e.length)}return null};function k(){var a=0;return document.documentElement&&document.documentElement.scrollTop?a=document.documentElement.scrollTop:document.body&&(a=document.body.scrollTop),a}var l=function(a){var b="uas_log_"+(new Date).getTime();var c=window[b]=new Image;c.onload=c.onerror=function(){window[b]=null},c.src=a,c=null};var m=j("pin")?j("pin"):"";var n=j("__jda")?j("__jda").split(".")[1]:"";var o=j("__jdb")?j("__jdb").split(".")[2]:"";var p=j("__jda")?j("__jda").split(".")[5]:"";var q=1;var r=function(a){if(a.clientX>1&&a.clientY>1){var b=a.clientX-window.screen.width/2;var c=a.clientY+k();var d=window.screen.width;var e="cw="+b+"$ch="+c+"$sw="+d+"$zb="+p+"$labt="+q;e=encodeURIComponent(e);var f=encodeURIComponent(document.referrer);var g="//mercury.jd.com/log.gif?t=uas.000000&m=UA-J2011-1&pin="+m+"&uid="+n+"&sid="+o+"&v="+e+"&ref="+f+"&rm="+(new Date).getTime();l(g)}};var s=function(a){var b="d="+a+"$zb="+p+"$labt=2";b=encodeURIComponent(b);var c=encodeURIComponent(document.referrer);var d="//mercury.jd.com/log.gif?t=uas.000000&m=UA-J2011-1&pin="+m+"&uid="+n+"&sid="+o+"&v="+b+"&ref="+c+"&rm="+(new Date).getTime();l(d)};var t=function(a,b){if(a.clientX>1&&a.clientY>1){var c=f(b);var d=$(c).offset();var e=a.clientX;var g=a.clientY+k();var h=window.screen.width;var i="cw="+(e-d.left)+"$ch="+(g-d.top)+"$sw="+h+"$zb="+p+"$labt=3$smid="+b;i=encodeURIComponent(i);var j=encodeURIComponent(document.referrer);var q="//mercury.jd.com/log.gif?t=uas.000000&m=UA-J2011-1&pin="+m+"&uid="+n+"&sid="+o+"&v="+i+"&ref="+j+"&rm="+(new Date).getTime();l(q)}};function u(){var a="boolean"==typeof document.hidden?!0:!1;if(a){var b=$(window);var c=[];function d(){var a=b.scrollTop();var c=b.height()+a;c=3e4>c?c:3e4;var d={t:a,b:c};return d}function e(){if(c.length>0){for(var a=0;a<c.length;a++)c[a].d=parseFloat(c[a].d.toFixed(2));var b=JSON.stringify(c);s(b)}}var f;var g;var h;setInterval(function(){a&&document.hidden===!1&&(e(),c=[])},5e3);var i=!1;function j(){window.clearTimeout(g),window.clearInterval(f),g=window.setTimeout(function(){h=d(),h.d=.5,c.push(h),f=window.setInterval(function(){a&&(document.hidden===!1?(i=!1,0===c.length?(h.d=0,c.push(h)):h.d+=.01):i===!1&&(e(),c=[],i=!0))},10)},500)}b.bind("scroll",function(){j()}),j()}}/isdebug=(-\d)*-30/.test(location.search)&&d.addHandler(document,"click",function(a){d.getEvent(a);h(a)});var v=function(a){var b=!1;var c=a.url.toLowerCase();var d=/http.*?\/\//gi;var e=location.href.toLowerCase();if(e=e.replace(d,function(){return""}),e.indexOf(c)>-1)return!0;if(a.skus&&e.indexOf("item.jd.com")>-1)for(var f in a.skus){var g=a.skus[f]+".html";if(e.indexOf(g)>-1)return!0}return b};var w=function(){var a=[];return function(b,c){if(c=c||!1,a=a.concat(b||[]),c){var d=a.join("$");a=[],d=encodeURIComponent(d);var e=encodeURIComponent(document.referrer);var f="//mercury.jd.com/log.gif?t=uas.000000&m=UA-J2011-1&pin="+m+"&uid="+n+"&sid="+o+"&v="+d+"&ref="+e+"&rm="+(new Date).getTime();l(f)}}}();d.addHandler(window,"load",function(){n&&$.ajax({url:"//d.jd.com/lab/get",dataType:"jsonp",jsonpCallback:"lab",cache:!0,success:function(e){e&&$.each(e,function(f){var h=e[f];var j=h.url.toLowerCase();var k=(new Date).getTime();return h.url&&h.startOn&&h.endOn&&h.percent&&v(h)&&k>=h.startOn&&k<=h.endOn+864e5&&i(n,1e4)<=100*parseInt(h.percent)?(d.addHandler(document,"click",function(){s('[{"t":0,"b":0,"d":0}]'),d.removeHandler(document,"click",arguments.callee)}),d.addHandler(document,"click",function(e){var f=d.getEvent(e);var h=d.getTarget(e);if(h.parentNode){var i=g(h);if(c(b.universal,i)||b.urls[j]&&c(b.urls[j],i)||r(f),a[j]){var k=c(a[j],i);k&&t(f,k)}}}),u(),!1):void 0})}})});function x(){function a(){return j||3==l?void clearInterval(k):(l++,void b())}function b(){var b=e.timing;var d=b.navigationStart;function f(){var a=b.domContentLoadedEventEnd-d;var e=b.loadEventEnd-d;if(!(0>e&&"msie"===i.name&&9===i.versionNumber)){var f=b.domInteractive-d;if(window.chrome&&window.chrome.loadTimes){var k=window.chrome.loadTimes();g=parseInt(1e3*(k.firstPaintTime-k.startLoadTime),10)}else"number"==typeof b.msFirstPaint&&(g=b.msFirstPaint-d);g=Math.max(0,g),e=Math.max(0,e);var l={dr:a,lp:e,fp:g,di:f,labt:100,zb:"undefined"!=typeof p?p:0,ecr:h};j=!0,w(c(l),!0)}}window.setTimeout(f,0)}function c(a){var b=[];for(var c in a)a.hasOwnProperty(c)&&b.push(c+"="+a[c]);return b}function d(){var b=f.body.querySelectorAll("*");for(var c=0,d=0;c<b.length;++c){var e=b[c].tagName.toLowerCase();"script"!==e&&"link"!==e&&"noscript"!==e&&d++}h=d}var e=window.performance||window.webkitPerformance||window.mozPerformance||window.msPerformance;var f=window.document;var g=-1;var h=-1;var i=y();var j=!1,k=null,l=0;w(["br="+[i.platform,i.name,i.versionNumber].join(".")]),e&&window.addEventListener?("complete"===f.readyState||"interactive"===f.readyState?d():f.addEventListener("DOMContentLoaded",d),"msie"===i.name&&9===i.versionNumber&&(k=setInterval(a,1e3)),window.addEventListener("load",b)):w(c({dr:0,lp:0,fp:0,di:0,labt:100,zb:"undefined"!=typeof p?p:0,ecr:0}),!0)}function y(a){function b(a){void 0===a&&(a=window.navigator.userAgent),a=a.toLowerCase();var b=/(edge)\/([\w.]+)/.exec(a)||/(opr)[\/]([\w.]+)/.exec(a)||/(chrome)[ \/]([\w.]+)/.exec(a)||/(version)(applewebkit)[ \/]([\w.]+).*(safari)[ \/]([\w.]+)/.exec(a)||/(webkit)[ \/]([\w.]+).*(version)[ \/]([\w.]+).*(safari)[ \/]([\w.]+)/.exec(a)||/(webkit)[ \/]([\w.]+)/.exec(a)||/(opera)(?:.*version|)[ \/]([\w.]+)/.exec(a)||/(msie) ([\w.]+)/.exec(a)||a.indexOf("trident")>=0&&/(rv)(?::| )([\w.]+)/.exec(a)||a.indexOf("compatible")<0&&/(mozilla)(?:.*? rv:([\w.]+)|)/.exec(a)||[];var c=/(win)/.exec(a)||/(mac)/.exec(a)||/(linux)/.exec(a)||/(cros)/.exec(a)||[];var d={},e={browser:b[5]||b[3]||b[1]||"",version:b[2]||b[4]||"0",versionNumber:b[4]||b[2]||"0",platform:c[0]||""};if(e.browser&&(d[e.browser]=!0,d.version=e.version,d.versionNumber=parseInt(e.versionNumber,10)),e.platform&&(d[e.platform]=!0),(d.cros||d.mac||d.linux||d.win)&&(d.desktop=!0),(d.chrome||d.opr||d.safari)&&(d.webkit=!0),d.rv||d.iemobile){var f="msie";e.browser=f,d[f]=!0}if(d.edge){delete d.edge;var g="msedge";e.browser=g,d[g]=!0}if(d.opr){var h="opera";e.browser=h,d[h]=!0}d.name=e.browser,d.platform=e.platform;var i=!1;return(b=/liebaofast\/([\w.]+)/.exec(a)||/liebao\/([\w.]+)/.exec(a)||/lbbrowser/.exec(a))&&(d.name="liebao",d.version=b[1]||"0",i=!0),/metasr/.test(a)&&(d.name="sougou",d.version="0",d.versionNumber=0),(b=/maxthon\/([\w.]+)/.exec(a)||/maxthon/.exec(a))&&(d.name="maxthon",d.version=b[1]||"0",i=!0),/360[se]e/.test(a)&&(d.name="360",d.version="0",d.versionNumber="0"),(b=/qqbrowser\/([\w.]+)/.exec(a)||/tencenttraveler ([\w.]+)/.exec(a))&&(d.name="qq",d.version=b[1]||"0",i=!0),i&&(d.versionNumber=parseInt(d.version,10)),d}return b(a||window.navigator.userAgent)}var z=null;switch(location.href){case"http://train.jd.com/":z="train";break;case"http://menpiao.jd.com/":z="menpiao";break;case"http://what.jd.com/what/index":case"http://what.jd.com/index":z="what";break;case"http://faner.jd.com/":z="faner";break;case"http://chaoshi.jd.com/":z="chaoshi"}n&&null!=z&&(w([z+"_pv=1"],!0),x())}}();
