package com.example.getgithubinfo.model;

import java.util.List;

/**
 * Created by bearyang on 2016/10/12.
 */

public class UserSearchResult {
	/**
	 * total_count : 7961
	 * incomplete_results : false
	 * items : [{"login":"young","id":984983,"avatar_url":"https://avatars.githubusercontent.com/u/984983?v=3","gravatar_id":"","url":"https://api.github.com/users/young","html_url":"https://github.com/young","followers_url":"https://api.github.com/users/young/followers","following_url":"https://api.github.com/users/young/following{/other_user}","gists_url":"https://api.github.com/users/young/gists{/gist_id}","starred_url":"https://api.github.com/users/young/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/young/subscriptions","organizations_url":"https://api.github.com/users/young/orgs","repos_url":"https://api.github.com/users/young/repos","events_url":"https://api.github.com/users/young/events{/privacy}","received_events_url":"https://api.github.com/users/young/received_events","type":"User","site_admin":false,"score":95.29481},{"login":"yhahn","id":83384,"avatar_url":"https://avatars.githubusercontent.com/u/83384?v=3","gravatar_id":"","url":"https://api.github.com/users/yhahn","html_url":"https://github.com/yhahn","followers_url":"https://api.github.com/users/yhahn/followers","following_url":"https://api.github.com/users/yhahn/following{/other_user}","gists_url":"https://api.github.com/users/yhahn/gists{/gist_id}","starred_url":"https://api.github.com/users/yhahn/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/yhahn/subscriptions","organizations_url":"https://api.github.com/users/yhahn/orgs","repos_url":"https://api.github.com/users/yhahn/repos","events_url":"https://api.github.com/users/yhahn/events{/privacy}","received_events_url":"https://api.github.com/users/yhahn/received_events","type":"User","site_admin":false,"score":46.57988},{"login":"littlehaker","id":1083307,"avatar_url":"https://avatars.githubusercontent.com/u/1083307?v=3","gravatar_id":"","url":"https://api.github.com/users/littlehaker","html_url":"https://github.com/littlehaker","followers_url":"https://api.github.com/users/littlehaker/followers","following_url":"https://api.github.com/users/littlehaker/following{/other_user}","gists_url":"https://api.github.com/users/littlehaker/gists{/gist_id}","starred_url":"https://api.github.com/users/littlehaker/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/littlehaker/subscriptions","organizations_url":"https://api.github.com/users/littlehaker/orgs","repos_url":"https://api.github.com/users/littlehaker/repos","events_url":"https://api.github.com/users/littlehaker/events{/privacy}","received_events_url":"https://api.github.com/users/littlehaker/received_events","type":"User","site_admin":false,"score":26.714539},{"login":"guker","id":4830247,"avatar_url":"https://avatars.githubusercontent.com/u/4830247?v=3","gravatar_id":"","url":"https://api.github.com/users/guker","html_url":"https://github.com/guker","followers_url":"https://api.github.com/users/guker/followers","following_url":"https://api.github.com/users/guker/following{/other_user}","gists_url":"https://api.github.com/users/guker/gists{/gist_id}","starred_url":"https://api.github.com/users/guker/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/guker/subscriptions","organizations_url":"https://api.github.com/users/guker/orgs","repos_url":"https://api.github.com/users/guker/repos","events_url":"https://api.github.com/users/guker/events{/privacy}","received_events_url":"https://api.github.com/users/guker/received_events","type":"User","site_admin":false,"score":26.36952},{"login":"youngshook","id":1398182,"avatar_url":"https://avatars.githubusercontent.com/u/1398182?v=3","gravatar_id":"","url":"https://api.github.com/users/youngshook","html_url":"https://github.com/youngshook","followers_url":"https://api.github.com/users/youngshook/followers","following_url":"https://api.github.com/users/youngshook/following{/other_user}","gists_url":"https://api.github.com/users/youngshook/gists{/gist_id}","starred_url":"https://api.github.com/users/youngshook/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/youngshook/subscriptions","organizations_url":"https://api.github.com/users/youngshook/orgs","repos_url":"https://api.github.com/users/youngshook/repos","events_url":"https://api.github.com/users/youngshook/events{/privacy}","received_events_url":"https://api.github.com/users/youngshook/received_events","type":"User","site_admin":false,"score":24.966463},{"login":"alexyoung","id":8345,"avatar_url":"https://avatars.githubusercontent.com/u/8345?v=3","gravatar_id":"","url":"https://api.github.com/users/alexyoung","html_url":"https://github.com/alexyoung","followers_url":"https://api.github.com/users/alexyoung/followers","following_url":"https://api.github.com/users/alexyoung/following{/other_user}","gists_url":"https://api.github.com/users/alexyoung/gists{/gist_id}","starred_url":"https://api.github.com/users/alexyoung/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/alexyoung/subscriptions","organizations_url":"https://api.github.com/users/alexyoung/orgs","repos_url":"https://api.github.com/users/alexyoung/repos","events_url":"https://api.github.com/users/alexyoung/events{/privacy}","received_events_url":"https://api.github.com/users/alexyoung/received_events","type":"User","site_admin":false,"score":22.831049},{"login":"gregoryyoung","id":381274,"avatar_url":"https://avatars.githubusercontent.com/u/381274?v=3","gravatar_id":"","url":"https://api.github.com/users/gregoryyoung","html_url":"https://github.com/gregoryyoung","followers_url":"https://api.github.com/users/gregoryyoung/followers","following_url":"https://api.github.com/users/gregoryyoung/following{/other_user}","gists_url":"https://api.github.com/users/gregoryyoung/gists{/gist_id}","starred_url":"https://api.github.com/users/gregoryyoung/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/gregoryyoung/subscriptions","organizations_url":"https://api.github.com/users/gregoryyoung/orgs","repos_url":"https://api.github.com/users/gregoryyoung/repos","events_url":"https://api.github.com/users/gregoryyoung/events{/privacy}","received_events_url":"https://api.github.com/users/gregoryyoung/received_events","type":"User","site_admin":false,"score":22.496109},{"login":"young-steveo","id":497048,"avatar_url":"https://avatars.githubusercontent.com/u/497048?v=3","gravatar_id":"","url":"https://api.github.com/users/young-steveo","html_url":"https://github.com/young-steveo","followers_url":"https://api.github.com/users/young-steveo/followers","following_url":"https://api.github.com/users/young-steveo/following{/other_user}","gists_url":"https://api.github.com/users/young-steveo/gists{/gist_id}","starred_url":"https://api.github.com/users/young-steveo/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/young-steveo/subscriptions","organizations_url":"https://api.github.com/users/young-steveo/orgs","repos_url":"https://api.github.com/users/young-steveo/repos","events_url":"https://api.github.com/users/young-steveo/events{/privacy}","received_events_url":"https://api.github.com/users/young-steveo/received_events","type":"User","site_admin":false,"score":22.361797},{"login":"youngsterxyf","id":834231,"avatar_url":"https://avatars.githubusercontent.com/u/834231?v=3","gravatar_id":"","url":"https://api.github.com/users/youngsterxyf","html_url":"https://github.com/youngsterxyf","followers_url":"https://api.github.com/users/youngsterxyf/followers","following_url":"https://api.github.com/users/youngsterxyf/following{/other_user}","gists_url":"https://api.github.com/users/youngsterxyf/gists{/gist_id}","starred_url":"https://api.github.com/users/youngsterxyf/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/youngsterxyf/subscriptions","organizations_url":"https://api.github.com/users/youngsterxyf/orgs","repos_url":"https://api.github.com/users/youngsterxyf/repos","events_url":"https://api.github.com/users/youngsterxyf/events{/privacy}","received_events_url":"https://api.github.com/users/youngsterxyf/received_events","type":"User","site_admin":false,"score":21.676807},{"login":"zhixiaoyang","id":6838656,"avatar_url":"https://avatars.githubusercontent.com/u/6838656?v=3","gravatar_id":"","url":"https://api.github.com/users/zhixiaoyang","html_url":"https://github.com/zhixiaoyang","followers_url":"https://api.github.com/users/zhixiaoyang/followers","following_url":"https://api.github.com/users/zhixiaoyang/following{/other_user}","gists_url":"https://api.github.com/users/zhixiaoyang/gists{/gist_id}","starred_url":"https://api.github.com/users/zhixiaoyang/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/zhixiaoyang/subscriptions","organizations_url":"https://api.github.com/users/zhixiaoyang/orgs","repos_url":"https://api.github.com/users/zhixiaoyang/repos","events_url":"https://api.github.com/users/zhixiaoyang/events{/privacy}","received_events_url":"https://api.github.com/users/zhixiaoyang/received_events","type":"User","site_admin":false,"score":21.62134},{"login":"youngytj","id":4630470,"avatar_url":"https://avatars.githubusercontent.com/u/4630470?v=3","gravatar_id":"","url":"https://api.github.com/users/youngytj","html_url":"https://github.com/youngytj","followers_url":"https://api.github.com/users/youngytj/followers","following_url":"https://api.github.com/users/youngytj/following{/other_user}","gists_url":"https://api.github.com/users/youngytj/gists{/gist_id}","starred_url":"https://api.github.com/users/youngytj/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/youngytj/subscriptions","organizations_url":"https://api.github.com/users/youngytj/orgs","repos_url":"https://api.github.com/users/youngytj/repos","events_url":"https://api.github.com/users/youngytj/events{/privacy}","received_events_url":"https://api.github.com/users/youngytj/received_events","type":"User","site_admin":false,"score":21.26643},{"login":"paulyoung","id":84700,"avatar_url":"https://avatars.githubusercontent.com/u/84700?v=3","gravatar_id":"","url":"https://api.github.com/users/paulyoung","html_url":"https://github.com/paulyoung","followers_url":"https://api.github.com/users/paulyoung/followers","following_url":"https://api.github.com/users/paulyoung/following{/other_user}","gists_url":"https://api.github.com/users/paulyoung/gists{/gist_id}","starred_url":"https://api.github.com/users/paulyoung/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/paulyoung/subscriptions","organizations_url":"https://api.github.com/users/paulyoung/orgs","repos_url":"https://api.github.com/users/paulyoung/repos","events_url":"https://api.github.com/users/paulyoung/events{/privacy}","received_events_url":"https://api.github.com/users/paulyoung/received_events","type":"User","site_admin":false,"score":21.000229},{"login":"geemion","id":7391178,"avatar_url":"https://avatars.githubusercontent.com/u/7391178?v=3","gravatar_id":"","url":"https://api.github.com/users/geemion","html_url":"https://github.com/geemion","followers_url":"https://api.github.com/users/geemion/followers","following_url":"https://api.github.com/users/geemion/following{/other_user}","gists_url":"https://api.github.com/users/geemion/gists{/gist_id}","starred_url":"https://api.github.com/users/geemion/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/geemion/subscriptions","organizations_url":"https://api.github.com/users/geemion/orgs","repos_url":"https://api.github.com/users/geemion/repos","events_url":"https://api.github.com/users/geemion/events{/privacy}","received_events_url":"https://api.github.com/users/geemion/received_events","type":"User","site_admin":false,"score":20.562286},{"login":"shama","id":99604,"avatar_url":"https://avatars.githubusercontent.com/u/99604?v=3","gravatar_id":"","url":"https://api.github.com/users/shama","html_url":"https://github.com/shama","followers_url":"https://api.github.com/users/shama/followers","following_url":"https://api.github.com/users/shama/following{/other_user}","gists_url":"https://api.github.com/users/shama/gists{/gist_id}","starred_url":"https://api.github.com/users/shama/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/shama/subscriptions","organizations_url":"https://api.github.com/users/shama/orgs","repos_url":"https://api.github.com/users/shama/repos","events_url":"https://api.github.com/users/shama/events{/privacy}","received_events_url":"https://api.github.com/users/shama/received_events","type":"User","site_admin":false,"score":20.136757},{"login":"newbieYoung","id":6898855,"avatar_url":"https://avatars.githubusercontent.com/u/6898855?v=3","gravatar_id":"","url":"https://api.github.com/users/newbieYoung","html_url":"https://github.com/newbieYoung","followers_url":"https://api.github.com/users/newbieYoung/followers","following_url":"https://api.github.com/users/newbieYoung/following{/other_user}","gists_url":"https://api.github.com/users/newbieYoung/gists{/gist_id}","starred_url":"https://api.github.com/users/newbieYoung/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/newbieYoung/subscriptions","organizations_url":"https://api.github.com/users/newbieYoung/orgs","repos_url":"https://api.github.com/users/newbieYoung/repos","events_url":"https://api.github.com/users/newbieYoung/events{/privacy}","received_events_url":"https://api.github.com/users/newbieYoung/received_events","type":"User","site_admin":false,"score":19.923388},{"login":"mutse","id":847230,"avatar_url":"https://avatars.githubusercontent.com/u/847230?v=3","gravatar_id":"","url":"https://api.github.com/users/mutse","html_url":"https://github.com/mutse","followers_url":"https://api.github.com/users/mutse/followers","following_url":"https://api.github.com/users/mutse/following{/other_user}","gists_url":"https://api.github.com/users/mutse/gists{/gist_id}","starred_url":"https://api.github.com/users/mutse/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/mutse/subscriptions","organizations_url":"https://api.github.com/users/mutse/orgs","repos_url":"https://api.github.com/users/mutse/repos","events_url":"https://api.github.com/users/mutse/events{/privacy}","received_events_url":"https://api.github.com/users/mutse/received_events","type":"User","site_admin":false,"score":19.620785},{"login":"young-geng","id":5175395,"avatar_url":"https://avatars.githubusercontent.com/u/5175395?v=3","gravatar_id":"","url":"https://api.github.com/users/young-geng","html_url":"https://github.com/young-geng","followers_url":"https://api.github.com/users/young-geng/followers","following_url":"https://api.github.com/users/young-geng/following{/other_user}","gists_url":"https://api.github.com/users/young-geng/gists{/gist_id}","starred_url":"https://api.github.com/users/young-geng/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/young-geng/subscriptions","organizations_url":"https://api.github.com/users/young-geng/orgs","repos_url":"https://api.github.com/users/young-geng/repos","events_url":"https://api.github.com/users/young-geng/events{/privacy}","received_events_url":"https://api.github.com/users/young-geng/received_events","type":"User","site_admin":false,"score":19.512222},{"login":"young4983","id":8604235,"avatar_url":"https://avatars.githubusercontent.com/u/8604235?v=3","gravatar_id":"","url":"https://api.github.com/users/young4983","html_url":"https://github.com/young4983","followers_url":"https://api.github.com/users/young4983/followers","following_url":"https://api.github.com/users/young4983/following{/other_user}","gists_url":"https://api.github.com/users/young4983/gists{/gist_id}","starred_url":"https://api.github.com/users/young4983/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/young4983/subscriptions","organizations_url":"https://api.github.com/users/young4983/orgs","repos_url":"https://api.github.com/users/young4983/repos","events_url":"https://api.github.com/users/young4983/events{/privacy}","received_events_url":"https://api.github.com/users/young4983/received_events","type":"User","site_admin":false,"score":19.489216},{"login":"wayhome","id":83735,"avatar_url":"https://avatars.githubusercontent.com/u/83735?v=3","gravatar_id":"","url":"https://api.github.com/users/wayhome","html_url":"https://github.com/wayhome","followers_url":"https://api.github.com/users/wayhome/followers","following_url":"https://api.github.com/users/wayhome/following{/other_user}","gists_url":"https://api.github.com/users/wayhome/gists{/gist_id}","starred_url":"https://api.github.com/users/wayhome/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/wayhome/subscriptions","organizations_url":"https://api.github.com/users/wayhome/orgs","repos_url":"https://api.github.com/users/wayhome/repos","events_url":"https://api.github.com/users/wayhome/events{/privacy}","received_events_url":"https://api.github.com/users/wayhome/received_events","type":"User","site_admin":false,"score":19.407688},{"login":"yangxt","id":1515324,"avatar_url":"https://avatars.githubusercontent.com/u/1515324?v=3","gravatar_id":"","url":"https://api.github.com/users/yangxt","html_url":"https://github.com/yangxt","followers_url":"https://api.github.com/users/yangxt/followers","following_url":"https://api.github.com/users/yangxt/following{/other_user}","gists_url":"https://api.github.com/users/yangxt/gists{/gist_id}","starred_url":"https://api.github.com/users/yangxt/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/yangxt/subscriptions","organizations_url":"https://api.github.com/users/yangxt/orgs","repos_url":"https://api.github.com/users/yangxt/repos","events_url":"https://api.github.com/users/yangxt/events{/privacy}","received_events_url":"https://api.github.com/users/yangxt/received_events","type":"User","site_admin":false,"score":19.324696},{"login":"tagsys","id":9910149,"avatar_url":"https://avatars.githubusercontent.com/u/9910149?v=3","gravatar_id":"","url":"https://api.github.com/users/tagsys","html_url":"https://github.com/tagsys","followers_url":"https://api.github.com/users/tagsys/followers","following_url":"https://api.github.com/users/tagsys/following{/other_user}","gists_url":"https://api.github.com/users/tagsys/gists{/gist_id}","starred_url":"https://api.github.com/users/tagsys/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/tagsys/subscriptions","organizations_url":"https://api.github.com/users/tagsys/orgs","repos_url":"https://api.github.com/users/tagsys/repos","events_url":"https://api.github.com/users/tagsys/events{/privacy}","received_events_url":"https://api.github.com/users/tagsys/received_events","type":"User","site_admin":false,"score":19.299257},{"login":"young-mu","id":7543236,"avatar_url":"https://avatars.githubusercontent.com/u/7543236?v=3","gravatar_id":"","url":"https://api.github.com/users/young-mu","html_url":"https://github.com/young-mu","followers_url":"https://api.github.com/users/young-mu/followers","following_url":"https://api.github.com/users/young-mu/following{/other_user}","gists_url":"https://api.github.com/users/young-mu/gists{/gist_id}","starred_url":"https://api.github.com/users/young-mu/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/young-mu/subscriptions","organizations_url":"https://api.github.com/users/young-mu/orgs","repos_url":"https://api.github.com/users/young-mu/repos","events_url":"https://api.github.com/users/young-mu/events{/privacy}","received_events_url":"https://api.github.com/users/young-mu/received_events","type":"User","site_admin":false,"score":19.179382},{"login":"ijy","id":434593,"avatar_url":"https://avatars.githubusercontent.com/u/434593?v=3","gravatar_id":"","url":"https://api.github.com/users/ijy","html_url":"https://github.com/ijy","followers_url":"https://api.github.com/users/ijy/followers","following_url":"https://api.github.com/users/ijy/following{/other_user}","gists_url":"https://api.github.com/users/ijy/gists{/gist_id}","starred_url":"https://api.github.com/users/ijy/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/ijy/subscriptions","organizations_url":"https://api.github.com/users/ijy/orgs","repos_url":"https://api.github.com/users/ijy/repos","events_url":"https://api.github.com/users/ijy/events{/privacy}","received_events_url":"https://api.github.com/users/ijy/received_events","type":"User","site_admin":false,"score":19.14013},{"login":"iangreenleaf","id":78887,"avatar_url":"https://avatars.githubusercontent.com/u/78887?v=3","gravatar_id":"","url":"https://api.github.com/users/iangreenleaf","html_url":"https://github.com/iangreenleaf","followers_url":"https://api.github.com/users/iangreenleaf/followers","following_url":"https://api.github.com/users/iangreenleaf/following{/other_user}","gists_url":"https://api.github.com/users/iangreenleaf/gists{/gist_id}","starred_url":"https://api.github.com/users/iangreenleaf/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/iangreenleaf/subscriptions","organizations_url":"https://api.github.com/users/iangreenleaf/orgs","repos_url":"https://api.github.com/users/iangreenleaf/repos","events_url":"https://api.github.com/users/iangreenleaf/events{/privacy}","received_events_url":"https://api.github.com/users/iangreenleaf/received_events","type":"User","site_admin":false,"score":19.062237},{"login":"younghz","id":3347697,"avatar_url":"https://avatars.githubusercontent.com/u/3347697?v=3","gravatar_id":"","url":"https://api.github.com/users/younghz","html_url":"https://github.com/younghz","followers_url":"https://api.github.com/users/younghz/followers","following_url":"https://api.github.com/users/younghz/following{/other_user}","gists_url":"https://api.github.com/users/younghz/gists{/gist_id}","starred_url":"https://api.github.com/users/younghz/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/younghz/subscriptions","organizations_url":"https://api.github.com/users/younghz/orgs","repos_url":"https://api.github.com/users/younghz/repos","events_url":"https://api.github.com/users/younghz/events{/privacy}","received_events_url":"https://api.github.com/users/younghz/received_events","type":"User","site_admin":false,"score":18.895514},{"login":"younglaker","id":3895607,"avatar_url":"https://avatars.githubusercontent.com/u/3895607?v=3","gravatar_id":"","url":"https://api.github.com/users/younglaker","html_url":"https://github.com/younglaker","followers_url":"https://api.github.com/users/younglaker/followers","following_url":"https://api.github.com/users/younglaker/following{/other_user}","gists_url":"https://api.github.com/users/younglaker/gists{/gist_id}","starred_url":"https://api.github.com/users/younglaker/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/younglaker/subscriptions","organizations_url":"https://api.github.com/users/younglaker/orgs","repos_url":"https://api.github.com/users/younglaker/repos","events_url":"https://api.github.com/users/younglaker/events{/privacy}","received_events_url":"https://api.github.com/users/younglaker/received_events","type":"User","site_admin":false,"score":18.796469},{"login":"dormouse","id":323858,"avatar_url":"https://avatars.githubusercontent.com/u/323858?v=3","gravatar_id":"","url":"https://api.github.com/users/dormouse","html_url":"https://github.com/dormouse","followers_url":"https://api.github.com/users/dormouse/followers","following_url":"https://api.github.com/users/dormouse/following{/other_user}","gists_url":"https://api.github.com/users/dormouse/gists{/gist_id}","starred_url":"https://api.github.com/users/dormouse/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/dormouse/subscriptions","organizations_url":"https://api.github.com/users/dormouse/orgs","repos_url":"https://api.github.com/users/dormouse/repos","events_url":"https://api.github.com/users/dormouse/events{/privacy}","received_events_url":"https://api.github.com/users/dormouse/received_events","type":"User","site_admin":false,"score":18.709072},{"login":"xyang619","id":1524579,"avatar_url":"https://avatars.githubusercontent.com/u/1524579?v=3","gravatar_id":"","url":"https://api.github.com/users/xyang619","html_url":"https://github.com/xyang619","followers_url":"https://api.github.com/users/xyang619/followers","following_url":"https://api.github.com/users/xyang619/following{/other_user}","gists_url":"https://api.github.com/users/xyang619/gists{/gist_id}","starred_url":"https://api.github.com/users/xyang619/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/xyang619/subscriptions","organizations_url":"https://api.github.com/users/xyang619/orgs","repos_url":"https://api.github.com/users/xyang619/repos","events_url":"https://api.github.com/users/xyang619/events{/privacy}","received_events_url":"https://api.github.com/users/xyang619/received_events","type":"User","site_admin":false,"score":18.65866},{"login":"illuz","id":5182173,"avatar_url":"https://avatars.githubusercontent.com/u/5182173?v=3","gravatar_id":"","url":"https://api.github.com/users/illuz","html_url":"https://github.com/illuz","followers_url":"https://api.github.com/users/illuz/followers","following_url":"https://api.github.com/users/illuz/following{/other_user}","gists_url":"https://api.github.com/users/illuz/gists{/gist_id}","starred_url":"https://api.github.com/users/illuz/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/illuz/subscriptions","organizations_url":"https://api.github.com/users/illuz/orgs","repos_url":"https://api.github.com/users/illuz/repos","events_url":"https://api.github.com/users/illuz/events{/privacy}","received_events_url":"https://api.github.com/users/illuz/received_events","type":"User","site_admin":false,"score":18.579153},{"login":"LindsayYoung","id":4406333,"avatar_url":"https://avatars.githubusercontent.com/u/4406333?v=3","gravatar_id":"","url":"https://api.github.com/users/LindsayYoung","html_url":"https://github.com/LindsayYoung","followers_url":"https://api.github.com/users/LindsayYoung/followers","following_url":"https://api.github.com/users/LindsayYoung/following{/other_user}","gists_url":"https://api.github.com/users/LindsayYoung/gists{/gist_id}","starred_url":"https://api.github.com/users/LindsayYoung/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/LindsayYoung/subscriptions","organizations_url":"https://api.github.com/users/LindsayYoung/orgs","repos_url":"https://api.github.com/users/LindsayYoung/repos","events_url":"https://api.github.com/users/LindsayYoung/events{/privacy}","received_events_url":"https://api.github.com/users/LindsayYoung/received_events","type":"User","site_admin":false,"score":18.398819}]
	 */

	private int total_count;
	private boolean incomplete_results;
	/**
	 * login : young
	 * id : 984983
	 * avatar_url : https://avatars.githubusercontent.com/u/984983?v=3
	 * gravatar_id :
	 * url : https://api.github.com/users/young
	 * html_url : https://github.com/young
	 * followers_url : https://api.github.com/users/young/followers
	 * following_url : https://api.github.com/users/young/following{/other_user}
	 * gists_url : https://api.github.com/users/young/gists{/gist_id}
	 * starred_url : https://api.github.com/users/young/starred{/owner}{/repo}
	 * subscriptions_url : https://api.github.com/users/young/subscriptions
	 * organizations_url : https://api.github.com/users/young/orgs
	 * repos_url : https://api.github.com/users/young/repos
	 * events_url : https://api.github.com/users/young/events{/privacy}
	 * received_events_url : https://api.github.com/users/young/received_events
	 * type : User
	 * site_admin : false
	 * score : 95.29481
	 */

	private List<ItemsBean> items;

	public int getTotal_count() {
		return total_count;
	}

	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}

	public boolean isIncomplete_results() {
		return incomplete_results;
	}

	public void setIncomplete_results(boolean incomplete_results) {
		this.incomplete_results = incomplete_results;
	}

	public List<ItemsBean> getItems() {
		return items;
	}

	public void setItems(List<ItemsBean> items) {
		this.items = items;
	}

	public static class ItemsBean {
		private String login;
		private int id;
		private String avatar_url;
		private String gravatar_id;
		private String url;
		private String html_url;
		private String followers_url;
		private String following_url;
		private String gists_url;
		private String starred_url;
		private String subscriptions_url;
		private String organizations_url;
		private String repos_url;
		private String events_url;
		private String received_events_url;
		private String type;
		private boolean site_admin;
		private double score;

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getAvatar_url() {
			return avatar_url;
		}

		public void setAvatar_url(String avatar_url) {
			this.avatar_url = avatar_url;
		}

		public String getGravatar_id() {
			return gravatar_id;
		}

		public void setGravatar_id(String gravatar_id) {
			this.gravatar_id = gravatar_id;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getHtml_url() {
			return html_url;
		}

		public void setHtml_url(String html_url) {
			this.html_url = html_url;
		}

		public String getFollowers_url() {
			return followers_url;
		}

		public void setFollowers_url(String followers_url) {
			this.followers_url = followers_url;
		}

		public String getFollowing_url() {
			return following_url;
		}

		public void setFollowing_url(String following_url) {
			this.following_url = following_url;
		}

		public String getGists_url() {
			return gists_url;
		}

		public void setGists_url(String gists_url) {
			this.gists_url = gists_url;
		}

		public String getStarred_url() {
			return starred_url;
		}

		public void setStarred_url(String starred_url) {
			this.starred_url = starred_url;
		}

		public String getSubscriptions_url() {
			return subscriptions_url;
		}

		public void setSubscriptions_url(String subscriptions_url) {
			this.subscriptions_url = subscriptions_url;
		}

		public String getOrganizations_url() {
			return organizations_url;
		}

		public void setOrganizations_url(String organizations_url) {
			this.organizations_url = organizations_url;
		}

		public String getRepos_url() {
			return repos_url;
		}

		public void setRepos_url(String repos_url) {
			this.repos_url = repos_url;
		}

		public String getEvents_url() {
			return events_url;
		}

		public void setEvents_url(String events_url) {
			this.events_url = events_url;
		}

		public String getReceived_events_url() {
			return received_events_url;
		}

		public void setReceived_events_url(String received_events_url) {
			this.received_events_url = received_events_url;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public boolean isSite_admin() {
			return site_admin;
		}

		public void setSite_admin(boolean site_admin) {
			this.site_admin = site_admin;
		}

		public double getScore() {
			return score;
		}

		public void setScore(double score) {
			this.score = score;
		}
	}
}
